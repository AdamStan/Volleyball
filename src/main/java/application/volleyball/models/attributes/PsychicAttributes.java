package application.volleyball.models.attributes;

public class PsychicAttributes {
	private Integer concentration;
	private Integer aggression;
	private Integer leadership;
	private Integer cooperation;
	private Integer decisions;
	
	public PsychicAttributes() {
		
	}
	
	public PsychicAttributes(Integer con, Integer agg, Integer lea, Integer coo, Integer dec) {
		this.concentration = con;
		this.aggression = agg;
		this.leadership = lea;
		this.concentration = coo;
		this.decisions = dec;
	}

	public Integer getConcentration() {
		return concentration;
	}

	public void setConcentration(Integer concentration) {
		this.concentration = concentration;
	}

	public Integer getAggression() {
		return aggression;
	}

	public void setAggression(Integer aggression) {
		this.aggression = aggression;
	}

	public Integer getLeadership() {
		return leadership;
	}

	public void setLeadership(Integer leadership) {
		this.leadership = leadership;
	}

	public Integer getCooperation() {
		return cooperation;
	}

	public void setCooperation(Integer cooperation) {
		this.cooperation = cooperation;
	}

	public Integer getDecisions() {
		return decisions;
	}

	public void setDecisions(Integer decisions) {
		this.decisions = decisions;
	}
	
	
}
