package elections;

public class Votes extends Candidates {

	
	private int numOfVotes;
	

	public int getNumOfVotes() {
		return numOfVotes;
	}

	public void setNumOfVotes(int numOfVotes) {
		this.numOfVotes = numOfVotes;
	}
	
	
	public int voting(int votes) {
		numOfVotes+=votes;
		return votes;
		
	}
	
	
	
	
}
