package com.skilldistillery.f1.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.f1.entities.Team;


@Service
@Transactional
public class TeamDAOImpl implements TeamDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Team findTeamById(int id) {
		
		return em.find(Team.class, id);
	}


	@Override
	public List<Team> findAll() {
		String query = "SELECT team FROM Team team";
		List<Team> teams = em.createQuery(query, Team.class).getResultList();
		
		return teams;
	}


	@Override
	public Team create(Team team) {
		em.persist(team);
		em.flush();
		return team;
	}


	@Override
	public boolean delete(Integer id) {
		em.remove(em.find(Team.class, id));
		Team team = em.find(Team.class, id);
		if (team == null) {
			return true;
		}
		return false;
	}


	@Override
	public Team modify(Team team, Integer id) {
		Team managedTeam = em.find(Team.class, id);
		managedTeam.setName(team.getName());
		
		return managedTeam;
	}

}
