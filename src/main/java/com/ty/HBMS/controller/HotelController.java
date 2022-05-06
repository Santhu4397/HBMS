package com.ty.HBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.HotelDao;
import com.ty.HBMS.dto.Hotel;

@Controller
public class HotelController {
	@Autowired
	private HotelDao hotelDao;
	private ModelAndView modelAndView=new ModelAndView();
	
	@RequestMapping("/hotel")
	public ModelAndView save() {
		modelAndView.setViewName("save_hotel.jsp");
		modelAndView.addObject("hotel",new Hotel());
		return modelAndView;
	}
	@RequestMapping("/savehotel")
	public ModelAndView saveHotel(@ModelAttribute Hotel hotel) {
		hotelDao.saveHotel(hotel);
		modelAndView.addObject("hotel",hotel);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}
	@RequestMapping("/getallhotels")
	public ModelAndView getAllHotel() {
		List<Hotel> hotels=hotelDao.getAllHotels();
		modelAndView.addObject("hotels",hotels);
		modelAndView.setViewName("view_hotel.jsp");
		return modelAndView;
	}
}
