package exercise_elections_My_version;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Election {
    
	HashMap<String,Integer> countOfEnvelopsPerCandidate = new HashMap<>();
	HashMap<Integer,Envelop> idForEachEnvelop =  new HashMap<>();
	ArrayList<Envelop> arrayOfEnvelops= new ArrayList<>();
	
	public void putEnvelop(Envelop evelop){ 
		arrayOfEnvelops.add(evelop);
	}
	private void addAndMarkDuplicatedEvelop(ArrayList<Envelop> arrayOfEvelops){
		for (Envelop envelop : arrayOfEvelops) { // For each element in array.
			if(idForEachEnvelop.containsKey(envelop.getId())) {   // If map have specific Id true.
				  for (Entry<Integer, Envelop> currSet : idForEachEnvelop.entrySet()) {
					  if(currSet.getKey() == envelop.getId()) {   // If Id from last received envelop equal to one of id's from HashMap , mark as duplicated .
						  currSet.getValue().setDuplicate();
					}
				} 	
			}
			else {
				idForEachEnvelop.put(envelop.getId(), envelop);
			}
		}
		deleteDuplicateEvelop(idForEachEnvelop);
	}
	
    private void deleteDuplicateEvelop(HashMap<Integer,Envelop> idForEachEvelop ) {
	   for (Entry<Integer, Envelop> currentSetIdandDuplicate : idForEachEvelop.entrySet()) {   
		   if(currentSetIdandDuplicate.getValue().getDuplicate()) {
			   idForEachEvelop.remove(currentSetIdandDuplicate.getValue().getId());
			   break;
		   }
		  // continue;
	  }
	   calcVotesForEachCandidate(idForEachEvelop);
   }
     
    private HashMap<String, Integer> calcVotesForEachCandidate(HashMap<Integer,Envelop> idForEachEvelop){
    	for (Entry<Integer, Envelop> currentSet : idForEachEvelop.entrySet()) {
    		String candidate =currentSet.getValue().getVote().getCandidate();
			if (countOfEnvelopsPerCandidate.containsKey(candidate)) { // if map include candidate true.
			     int count = countOfEnvelopsPerCandidate.get(candidate); // How many votes candidate had before.
			    // String  candidate= currentSet.getValue().getVote().getCandidate(); // Get name of candidate
			     countOfEnvelopsPerCandidate.put(candidate, ++count);  //increase counter , and then add to map;
			}
			else {
				 countOfEnvelopsPerCandidate.put(candidate, 1);// If candidate not exists in map. 
			}
		}   	
    	return countOfEnvelopsPerCandidate;  	
    }
    
    public HashMap<String, Integer> publishElectionResult(){
    	addAndMarkDuplicatedEvelop(arrayOfEnvelops);
		return countOfEnvelopsPerCandidate;
		
    }
}
