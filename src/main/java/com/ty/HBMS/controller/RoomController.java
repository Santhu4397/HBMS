package com.ty.HBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.HotelDao;
import com.ty.HBMS.dao.RoomDao;
import com.ty.HBMS.dto.Rooms;

@Controller
public class RoomController {
	@Autowired
	private RoomDao dao;
	@Autowired
	private HotelDao hotelDao;
	private ModelAndView mv = new ModelAndView();
	private int hotelId;

	@RequestMapping("rooms")
	public ModelAndView creatRoom(@RequestParam int hotelid) {
		this.hotelId = hotelid;
		mv.addObject("room", new Rooms());
		mv.setViewName("saveRooms.jsp");
		return mv;
	}

	@PostMapping("saverooms")
	public ModelAndView saveRoom(@ModelAttribute Rooms rooms) {
		rooms.setRoomavilable("available");
		dao.saveRoom(rooms, hotelId);
		mv.setViewName("Home.jsp");
		return mv;
	}

	@RequestMapping("getroom")
	public ModelAndView getRoom(@RequestParam int hotelid) {
		List<Rooms> rooms = hotelDao.getHotelById(hotelid).getRooms();
		mv.addObject("rooms", rooms);
		mv.setViewName("getRooms.jsp");
		return mv;
	}

	@RequestMapping("getbyidroom")
	public ModelAndView getById(@RequestParam int id) {
		System.out.println(id);
		Rooms rooms = dao.getById(id);
		mv.addObject("rooms", rooms);
		mv.setViewName("updateRoom.jsp");
		return mv;
	}

	@RequestMapping("updateroom")
	public ModelAndView updateRoom(@ModelAttribute Rooms rooms) {
		dao.updateRoom(rooms);
		mv.setViewName("Home.jsp");
		return mv;
	}

	@RequestMapping("removeroom")
	public ModelAndView remove(@RequestParam int id) {
		dao.removeRoom(id);
		mv.setViewName("Home.jsp");
		return mv;
	}

}
