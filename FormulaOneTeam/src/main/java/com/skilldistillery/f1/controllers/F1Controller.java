package com.skilldistillery.f1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class F1Controller {

	@RequestMapping(path= "/", method = RequestMethod.GET)
	private String index() {
		return "WEB-INF/home.jsp";
	}
}
