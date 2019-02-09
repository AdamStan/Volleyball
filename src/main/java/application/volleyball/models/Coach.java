package application.volleyball.models;

import java.time.LocalDate;

import application.volleyball.models.attributes.CoachingAttributes;

public class Coach extends Person {
	
	private CoachingAttributes coachingAttributes;
	
	public Coach(String name, String surname, LocalDate date) {
		this.name = name;
		this.surname = surname;
		this.secondName = "";
		this.birthday = date;
	}
	
	
	
}
