package com.ty.HBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.UserDao;
import com.ty.HBMS.dto.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	@RequestMapping("user")
	public ModelAndView User() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new User());
		mv.setViewName("saveUser.jsp");
		return mv;
	}
	@RequestMapping("saveuser")
	public ModelAndView saveUser(@ModelAttribute User user) {
		dao.saveUser(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home.jsp");
		return mv;
	}
}
