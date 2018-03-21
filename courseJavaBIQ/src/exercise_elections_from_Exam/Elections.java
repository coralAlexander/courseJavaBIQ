package exercise_elections_from_Exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Elections {
    private ArrayList<Envelope> envelopes = new ArrayList<Envelope>();
    private HashMap<String, Integer> results = new HashMap<>();
    private HashMap<String, Vote> id2vote = new HashMap<>();
    
    public void castVote(Envelope actualVote) {
        envelopes.add(actualVote);
    }

    public HashMap<String, Integer> getResults() {
        return results;
    }

    public void calcResults() {
        // manage duplicates
        for(Envelope envelope : envelopes) {
            String id = envelope.getId();
            Vote vote = id2vote.get(id);
            if(vote != null) {
                vote.setDuplicate();
            }
            else {
                id2vote.put(id, envelope.getVote());
            }
        }

        // calc results
        for(Vote vote : id2vote.values()) {
            if(!vote.isDuplicate()) {
                String candidate = vote.getCandidate();
                Integer count = results.get(candidate);
                if(count == null) {
                    count = 0;
                }
                results.put(candidate, count + 1);
            }
        }
    }
}
