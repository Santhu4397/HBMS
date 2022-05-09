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

import com.ty.HBMS.dao.HotelDao;
import com.ty.HBMS.dto.Hotel;
import com.ty.HBMS.dto.User;

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
	public ModelAndView saveHotel(@ModelAttribute Hotel hotel,HttpServletRequest req) {
		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("user");
		List<User>list= new ArrayList<User>();	
			list.add(user);
			hotel.setUsers(list);
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
	@RequestMapping("/edithotel")
	public ModelAndView editHotel(@RequestParam int hotelid) {
		Hotel hotel=hotelDao.getHotelById(hotelid);
		modelAndView.setViewName("edit_hotel.jsp");
		modelAndView.addObject("edithotel", hotel);
		return modelAndView;
	}
	@RequestMapping("updatehotel")
	public ModelAndView updateHotel(@ModelAttribute Hotel edithotel) {
		hotelDao.updateHotel(edithotel);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}
	@RequestMapping("removehotel")
	public ModelAndView deleteHotel(@RequestParam int hotelid) {
		hotelDao.deleteHotel(hotelid);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}
}
