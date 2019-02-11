package application.volleyball.models;

import java.util.HashSet;
import java.util.Set;

public class League {
	private String name;
	private Set<Club> clubs = new HashSet<Club>();
	private Integer howManyOut;
	
	public League(String name) {
		this.name = name;
		this.howManyOut = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Club> getClubs() {
		return clubs;
	}

	public void setClubs(Set<Club> clubs) {
		this.clubs = clubs;
	}

	public Integer getHowManyOut() {
		return howManyOut;
	}

	public void setHowManyOut(Integer howManyOut) {
		this.howManyOut = howManyOut;
	}
	
}
