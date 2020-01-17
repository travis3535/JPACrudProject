package com.skilldistillery.f1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
	//Fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String driver;
	private String teamPrinciple;
	private String estYear;
	private String description;
	private String factoryLocation;
	
	
	
	
	//Getters and Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getTeamPrinciple() {
		return teamPrinciple;
	}
	public void setTeamPrinciple(String teamPrinciple) {
		this.teamPrinciple = teamPrinciple;
	}
	public String getEstYear() {
		return estYear;
	}
	public void setEstYear(String estYear) {
		this.estYear = estYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFactoryLocation() {
		return factoryLocation;
	}
	public void setFactoryLocation(String factoryLocation) {
		this.factoryLocation = factoryLocation;
	
	
	
	// Constructors
	
	}
	public Team() {
		super();
	}
	public Team(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", driver=" + driver + ", teamPrinciple=" + teamPrinciple
				+ ", estYear=" + estYear + ", description=" + description + ", factoryLocation=" + factoryLocation
				+ "]";
	}
	
	
	//Hash and Equals
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + ((estYear == null) ? 0 : estYear.hashCode());
		result = prime * result + ((factoryLocation == null) ? 0 : factoryLocation.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teamPrinciple == null) ? 0 : teamPrinciple.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		if (estYear == null) {
			if (other.estYear != null)
				return false;
		} else if (!estYear.equals(other.estYear))
			return false;
		if (factoryLocation == null) {
			if (other.factoryLocation != null)
				return false;
		} else if (!factoryLocation.equals(other.factoryLocation))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teamPrinciple == null) {
			if (other.teamPrinciple != null)
				return false;
		} else if (!teamPrinciple.equals(other.teamPrinciple))
			return false;
		return true;
	}
	
	
	
	


	

}
