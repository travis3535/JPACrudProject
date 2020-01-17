package com.skilldistillery.f1.data;

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

}
