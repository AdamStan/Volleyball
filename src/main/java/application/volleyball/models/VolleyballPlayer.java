package application.volleyball.models;

import application.volleyball.models.attributes.PhysicalAttributes;
import application.volleyball.models.attributes.PsychicAttributes;
import application.volleyball.models.attributes.TechnicalAttributes;

public class VolleyballPlayer extends Person{
	public enum Position {
		SETTER, 
		MIDDLE_BLOCKER,
		SPIKER,
		LIBERO,
		RECEIVER;
	}
	
	private Position position;
	private PhysicalAttributes physicalAttributes;
	private PsychicAttributes psychicAttributes;
	private TechnicalAttributes technicalAttributes;
	
	public VolleyballPlayer() {
		
	}
	
	
}
