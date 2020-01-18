package com.skilldistillery.f1.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TeamTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Team team;
	

	@Test
	void testTeam() {
		assertEquals("Mclaren", team.getName());
		assertEquals("Lando Norris", team.getDriver());
		assertEquals("1966", team.getEstYear());
		assertEquals("Andreas Seidl", team.getTeamPrinciple());
		assertEquals("8 World Championships", team.getDescription());
		assertEquals("United Kingdom", team.getFactoryLocation());
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("FormulaOne");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		team = em.find(Team.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.clear();
		team = null;
	}
	
	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
