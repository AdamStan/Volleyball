package application.volleyball.models;

import java.time.LocalDate;

import application.volleyball.models.attributes.CoachingAttributes;

public class Coach extends Person {
	
	private CoachingAttributes coachingAttributes;
	private Club club;	
	
	{
		coachingAttributes = new CoachingAttributes();
	}
	
	public Coach(String name, String surname, LocalDate date) {
		this.name = name;
		this.surname = surname;
		this.secondName = "";
		this.birthday = date;
	}
	
	public Coach(String name, String secondName, String surname, LocalDate date) {
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.birthday = date;
	}

	public CoachingAttributes getCoachingAttributes() {
		return coachingAttributes;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
}
