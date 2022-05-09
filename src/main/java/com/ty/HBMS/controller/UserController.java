package com.ty.HBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.UserDao;
import com.ty.HBMS.dto.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	private ModelAndView mv = new ModelAndView();
	

	@RequestMapping("user")
	public ModelAndView User() {
		mv.addObject("user", new User());
		mv.setViewName("saveUser.jsp");
		return mv;
	}

	@RequestMapping("saveuser")
	public ModelAndView saveUser(@ModelAttribute User user) {
		dao.saveUser(user);
		mv.addObject("save", user);
		mv.setViewName("Home.jsp");
		return mv;
	}

	@RequestMapping("getallusers")
	public ModelAndView getAllUser() {
		mv.addObject("users",dao.getAllUser());
		mv.setViewName("getUser.jsp");
		return mv;
	}
	@RequestMapping("getbyid")
	public ModelAndView getbyid(@RequestParam int id) {
		User user =dao.getUser(id);
		mv.addObject("user", user);
		mv.setViewName("updateUser.jsp");
		return mv;
	}
	@PostMapping("updateuser")
	public ModelAndView updateUser(@ModelAttribute User user) {
		dao.updateUSer(user);
		mv.addObject("update", user);
		mv.setViewName("Home.jsp");
		return mv;
	}
	@RequestMapping("deleteuser")
	public ModelAndView removeUser(@RequestParam int id) {
		dao.remove(id);
		mv.addObject("remove", id);
		mv.setViewName("Home.jsp");
		return mv;
	}
}
