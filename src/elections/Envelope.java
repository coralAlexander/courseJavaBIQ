package elections;

public class Envelope {
    private String id;
    private Vote vote;
    public Envelope(String id, Vote vote) {
        this.id = id;
        this.vote = vote;
    }

    public String getId() {
        return id;
    }

    public Vote getVote() {
        return vote;
    }
}
