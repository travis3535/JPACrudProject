package com.skilldistillery.f1.controllers;

import java.util.List;

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
	private String index(Model model) {
		List<Team> teams = dao.findAll();
		model.addAttribute("findAll", teams);
		
		return "WEB-INF/home.jsp";
	}
	
	@RequestMapping(path="getTeam.do")
	public String showTeam(@RequestParam Integer id, Model model) {
		Team team = null;
		if (id == null) {
			List<Team> teams = dao.findAll();
			model.addAttribute("findAll", teams);
			return "WEB-INF/home.jsp";
		}
		
		team = dao.findTeamById(id);
		model.addAttribute("team", team);
		
		
		return "WEB-INF/show.jsp";
		
	}
	
	@RequestMapping(path="create.do", method = RequestMethod.POST)
	public String create(Team team, Model model) {
		team = dao.create(team);
		model.addAttribute("team", team);
		
		List<Team> teams = dao.findAll();
		model.addAttribute("findAll", teams);
		return "WEB-INF/home.jsp";
	}
	@RequestMapping(path="create.do", method= RequestMethod.GET)
	public String goToCreate() {
		return "WEB-INF/create.jsp";
		
	}
	
	@RequestMapping(path="delete.do", method = RequestMethod.POST)
	public String delete(@RequestParam Integer id, Model model) {
		boolean success = dao.delete(id);
		
		List<Team> teams = dao.findAll();
		model.addAttribute("findAll", teams);
		return "WEB-INF/home.jsp";
	}
	
	@RequestMapping(path="delete.do", method = RequestMethod.GET)
	public String goToDelte(@RequestParam Integer id, Model model) {
		model.addAttribute("id", id);
		
		
		return "WEB-INF/delete.jsp";
	}
	@RequestMapping(path="modify.do", method = RequestMethod.GET)
	public String goToModify(Integer id, Model model) {
		
		Team team = dao.findTeamById(id);
		model.addAttribute("team", team);
		
		return "WEB-INF/modify.jsp";
		
	}
	
	@RequestMapping(path="modify.do", method = RequestMethod.POST)
	public String modify(Integer id, Team team, Model model) {
		Team managedTeam =dao.modify(team, id);
		
		
		model.addAttribute("team", managedTeam);
		
		List<Team> teams = dao.findAll();
		model.addAttribute("findAll", teams);
		return "WEB-INF/home.jsp";
	}
}
