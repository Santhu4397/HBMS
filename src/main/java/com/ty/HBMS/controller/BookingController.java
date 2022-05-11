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
	private int roomId;
	private HttpSession httpSession;

	@RequestMapping("booking")
	public ModelAndView save(HttpServletRequest request) {
		List<Rooms> rooms = new ArrayList<Rooms>();
		httpSession = request.getSession();

		modelAndView.setViewName("save_booking.jsp");
		modelAndView.addObject("booking", new Booking());
		modelAndView.addObject("rooms", rooms);
		return modelAndView;
	}

	@RequestMapping("add")
	public ModelAndView addToSession(@RequestParam int roomId, HttpServletRequest request) {
		this.roomId = roomId;
		httpSession = request.getSession();
		Rooms room = roomDao.getById(roomId);
		List<Rooms> rooms = null;
		if (rooms == null) {
			rooms = new ArrayList<Rooms>();
			rooms.add(room);
		} else {
			rooms.add(room);
		}
		httpSession.setAttribute("rooms", rooms);
		modelAndView.setViewName("user_navbar.jsp");
		return modelAndView;
	}

	@RequestMapping("showcart")
	public ModelAndView showCart() {
		modelAndView.setViewName("showcart.jsp");
		return modelAndView;
	}

	@RequestMapping("savebooking")
	public ModelAndView saveBooking(@ModelAttribute Booking booking, HttpServletRequest request) {
		httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		booking.setUser(user);
		List<Rooms> rooms = (List<Rooms>) httpSession.getAttribute("rooms");
		booking.setRooms(rooms);
		bookingDao.saveBooking(booking);
		for (Rooms r : rooms) {
			r.setRoomavilable("Booked");
			r.setBookings(booking);
		}
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
