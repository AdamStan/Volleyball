package application.volleyball.models;

public class Result {
	private Match match;
	
	public Result(Match match){
		this.match = match;
	}
	
	@Override
	public String toString() {
		return "Result";
	}
}
