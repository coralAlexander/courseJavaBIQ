package elections;

public class Vote {
    private String candidate;
    private boolean isDuplicate = false;
    public Vote(String candidate) {
        this.candidate = candidate;
    }

    public boolean isDuplicate() {
        return isDuplicate;
    }

    public void setDuplicate() {
        isDuplicate = true;
    }

    public String getCandidate() {
        return candidate;
    }
}
