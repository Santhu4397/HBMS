package com.ty.HBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.RoomDao;
import com.ty.HBMS.dto.Rooms;
import com.ty.HBMS.dto.User;

@Controller
public class RoomController {
	@Autowired
	private RoomDao dao;
	private ModelAndView mv = new ModelAndView();

	@RequestMapping("rooms")
	public ModelAndView creatRoom() {
		mv.addObject("room", new Rooms());
		mv.setViewName("saveRooms.jsp");
		return mv;
	}

	@PostMapping("saverooms")
	public ModelAndView saveRoom(@ModelAttribute Rooms rooms) {
		dao.saveRoom(rooms);
		mv.setViewName("Home.jsp");
		return mv;
	}

	@RequestMapping("getroom")
	public ModelAndView getRoom() {
		List<Rooms> rooms = dao.getRooms();
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
