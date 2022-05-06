package com.ty.HBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.RoomDao;
import com.ty.HBMS.dto.Rooms;

@Controller
public class RoomController {
	@Autowired
	private RoomDao dao;
	private ModelAndView mv;
	@RequestMapping("rooms")
	public ModelAndView creatRoom() {
		mv.addObject("room",new Rooms());
		mv.setViewName("saveRooms.jsp");
		return mv;
	}
	@PostMapping("saverooms")
	public ModelAndView saveRoom() {
		mv.setViewName("Home.jsp");
		return mv;
	}
}
