package application.volleyball.models;

import java.util.Set;

public class Club {
	private String name;
	private League league;
	private Set<VolleyballPlayer> players;
	private Coach coach;
	
	public Club() {
		
	}
	
	public Club(String name, League league, Coach coach) {
		this.name = name;
		this.league = league;
		this.coach = coach;
	}
	
	
	
}
