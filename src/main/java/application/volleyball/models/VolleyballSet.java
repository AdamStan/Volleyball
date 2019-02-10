package application.volleyball.models;

import java.util.ArrayList;
import java.util.List;

public class VolleyballSet {
	private class Point {
		private VolleyballPlayer whoScored;
		
		public Point(VolleyballPlayer player) {
			whoScored = player;
		}
	}
	
	private List<Point> homePoints = new ArrayList<Point>();
	private List<Point> awayPoints = new ArrayList<Point>();
	
	public void addHomePoint(VolleyballPlayer who) {
		homePoints.add(new Point(who));
	}
	
	public void addAwayPoint(VolleyballPlayer who) {
		awayPoints.add(new Point(who));
	}
	
	public Integer getHomePoints() {
		return homePoints.size();
	}
	
	public Integer getAwayPoints() {
		return awayPoints.size();
	}
	
	public boolean didHomeWin() {
		return homePoints.size() > awayPoints.size();
	}
	
	public boolean didAwayWin() {
		return !didHomeWin();
	}
}
