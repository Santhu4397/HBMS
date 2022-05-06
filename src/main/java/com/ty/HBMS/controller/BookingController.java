package com.ty.HBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.BookingDao;
import com.ty.HBMS.dto.Booking;

@Controller
public class BookingController {
	@Autowired
	private BookingDao bookingDao;
	private ModelAndView modelAndView = new ModelAndView();

	@RequestMapping("booking")
	public ModelAndView save() {
		modelAndView.setViewName("save_booking.jsp");
		modelAndView.addObject("booking", new Booking());
		return modelAndView;
	}

	@RequestMapping("savebooking")
	public ModelAndView saveBooking(@ModelAttribute Booking booking) {
		bookingDao.saveBooking(booking);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}

	@RequestMapping("getallbookings")
	public ModelAndView getAllBookings() {
		List<Booking> bookings = bookingDao.getAllBooking();
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
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}

	@RequestMapping("removebooking")
	public ModelAndView deleteBooking(@RequestParam int id) {
		bookingDao.deleteBooking(id);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}
}