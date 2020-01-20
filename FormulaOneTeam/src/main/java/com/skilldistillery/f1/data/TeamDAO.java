package com.skilldistillery.f1.data;

import java.util.List;

import com.skilldistillery.f1.entities.Team;

public interface TeamDAO {
	
	Team findTeamById(int id);
	
	List<Team> findAll();
	
	Team create(Team team);
	
	boolean delete(Integer id);
	
	Team modify(Team team, Integer id);

}
