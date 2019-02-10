package application.volleyball.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Match {
	private Club homeClub;
	private Club awayClub;
	
	private List<VolleyballPlayer> homePlayers;
	private List<VolleyballPlayer> awayPlayers;
	
	/** key - set, first, second etc*/
	private Map<Integer, VolleyballSet> volleyballSets = new HashMap<Integer, VolleyballSet>();
	
	public Match(Club home, Club away) {
		homeClub = home;
		awayClub = away;
	}
	
	public void start() {
		
	}
	
	public Result getResult() {
		return null;
	}

	public Club getHomeClub() {
		return homeClub;
	}

	public void setHomeClub(Club homeClub) {
		this.homeClub = homeClub;
	}

	public Club getAwayClub() {
		return awayClub;
	}

	public void setAwayClub(Club awayClub) {
		this.awayClub = awayClub;
	}

	public List<VolleyballPlayer> getHomePlayers() {
		return homePlayers;
	}

	public void setHomePlayers(List<VolleyballPlayer> homePlayers) {
		this.homePlayers = homePlayers;
	}

	public List<VolleyballPlayer> getAwayPlayers() {
		return awayPlayers;
	}

	public void setAwayPlayers(List<VolleyballPlayer> awayPlayers) {
		this.awayPlayers = awayPlayers;
	}

	public Map<Integer, VolleyballSet> getVolleyballSets() {
		return volleyballSets;
	}

	public void setVolleyballSets(Map<Integer, VolleyballSet> volleyballSets) {
		this.volleyballSets = volleyballSets;
	}	
}
