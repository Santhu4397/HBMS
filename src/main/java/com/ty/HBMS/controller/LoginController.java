package com.ty.HBMS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.HBMS.dao.UserDao;
import com.ty.HBMS.dto.User;

@Controller
public class LoginController {
	@Autowired
	private UserDao dao;
	ModelAndView mv=new ModelAndView();

	@PostMapping("my")
	public ModelAndView login(HttpServletRequest req) {
		String email=req.getParameter("emailid");
		String pass=req.getParameter("pass");
		User user=dao.validate(email, pass);  
		if(user!=null&&(user.getRole().equalsIgnoreCase("admin"))) {
			HttpSession session=req.getSession();
			session.setAttribute("userid", user);
			System.out.println("1");
			 mv.setViewName("Home.jsp");
			 System.out.println("2");
			 return mv;
		}
		else {
			mv.setViewName("login,jsp");
			return mv;
		}
	
		
	}
	@RequestMapping("logout")
	public ModelAndView logout() {
		mv.setViewName("Home.jsp");
		return mv;
	}
}
