package com.skilldistillery.f1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.f1.data.TeamDAO;
import com.skilldistillery.f1.entities.Team;

@Controller
public class F1Controller {
	
	@Autowired
	private TeamDAO dao;

	@RequestMapping(path= "/", method = RequestMethod.GET)
	private String index() {
		return "WEB-INF/home.jsp";
	}
	
	@RequestMapping(path="getTeam.do")
	public String showTeam(@RequestParam Integer id, Model model) {
		Team team = null;
		
		team = dao.findTeamById(id);
		model.addAttribute("team", team);
		
		return "WEB-INF/show.jsp";
		
	}
	
	
}
