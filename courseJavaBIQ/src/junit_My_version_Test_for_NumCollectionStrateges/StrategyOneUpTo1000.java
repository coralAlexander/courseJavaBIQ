package junit_My_version_Test_for_NumCollectionStrateges;

import java.util.ArrayList;

public class StrategyOneUpTo1000 extends Strategy {

	ArrayList<Integer> totalList = new ArrayList<>();
	
	public StrategyOneUpTo1000() {
		super();	
	}
	public ArrayList<Integer> addToArrayList(ArrayList range, ArrayList list ) {
		if (!range.isEmpty()) {
			for(int i =  (int) range.get(0) ; i <= (int)range.get(range.size() -1); i++) {
				totalList.add(i);
			}
		}
	    for (int i = 0; i < list.size(); i++) {
	    	totalList.add((Integer) list.get(i));
		}
	    return totalList;
	}
	
}
