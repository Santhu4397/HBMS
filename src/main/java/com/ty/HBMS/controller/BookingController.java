package com.ty.HBMS.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.BookingDao;
import com.ty.HBMS.dao.RoomDao;
import com.ty.HBMS.dto.Booking;
import com.ty.HBMS.dto.Rooms;
import com.ty.HBMS.dto.User;

@Controller
public class BookingController {
	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private RoomDao roomDao;
	private ModelAndView modelAndView = new ModelAndView();

	@RequestMapping("booking")
	public ModelAndView save(@RequestParam int roomId) {
		Rooms room = roomDao.getById(roomId);
		List<Rooms> rooms = new ArrayList<Rooms>();
		if (room.getRoomavilable().equalsIgnoreCase("Available") && !room.getRoomavilable().equals("Booked")) {
			room.setRoomavilable("Booked");
		}
		rooms.add(room);
		Booking booking = new Booking();
		booking.setRooms(rooms);
		modelAndView.setViewName("save_booking.jsp");
		modelAndView.addObject("booking", booking);
		return modelAndView;
	}

	@RequestMapping("savebooking")
	public ModelAndView saveBooking(@ModelAttribute Booking booking, HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		booking.setUser(user);
		bookingDao.saveBooking(booking);
		modelAndView.setViewName("user_navbar.jsp");
		return modelAndView;
	}

	@RequestMapping("getallbookings")
	public ModelAndView getAllBookings(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		List<Booking> bookings = user.getBookings();
		modelAndView.setViewName("view_booking.jsp");
		modelAndView.addObject("booking", bookings);
		return modelAndView;
	}

	@RequestMapping("editbooking")
	public ModelAndView editBooking(@RequestParam int id) {
		Booking booking = bookingDao.getBookingById(id);
		modelAndView.setViewName("edit_booking.jsp");
		modelAndView.addObject("booking", booking);
		return modelAndView;
	}

	@RequestMapping("updatebooking")
	public ModelAndView updateBooking(@ModelAttribute Booking bookings) {
		bookingDao.updateBooking(bookings);
		System.out.println(bookings.getNumofadults());
		modelAndView.setViewName("user_navbar.jsp");
		return modelAndView;
	}

	@RequestMapping("removebooking")
	public ModelAndView deleteBooking(@RequestParam int id) {
		bookingDao.deleteBooking(id);
		modelAndView.setViewName("user_navbar.jsp");
		return modelAndView;
	}
}
