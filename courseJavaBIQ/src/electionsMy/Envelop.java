package electionsMy;

public class Envelop {

	private int id ;
	private Vote vote;
	private boolean duplicate;
	public Envelop ( int id,Vote vote){
		this.id=id;
		this.vote=vote;
	}

	public int getId() {
		return id;
	}

	public Vote getVote() {
		return vote;
	}

	public boolean getDuplicate () {
		return duplicate;
	}
	public void setDuplicate() {
		this.duplicate = true;
	}
	

}
