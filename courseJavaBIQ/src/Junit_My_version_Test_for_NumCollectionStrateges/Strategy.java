package Junit_My_version_Test_for_NumCollectionStrateges;

import java.util.ArrayList;

public abstract class Strategy {

	private int minRage;
	private int maxRange;
	private ArrayList<Integer> list = new ArrayList<>();
	
	public Strategy(int minRage,int maxRange) {
		this.minRage=minRage;
		this.maxRange=maxRange;
		this.list=list;
	}
	
	 public boolean contains(int number) {
	    	for (Integer curr : list) {
				if (curr == number) {
					return true;
				}	
			}
	    	return false;
	} 	
    	
 
}
