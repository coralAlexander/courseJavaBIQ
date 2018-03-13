package electionsMy;

import java.util.ArrayList;
import java.util.HashMap;

public class ElectionsMain {

	public static void main(String[] args) {
		Election election = new Election();
		Vote vote1 = new Vote("Tramp");
		Vote vote2 = new Vote("Putin");
		Vote vote3 = new Vote("Putin");
		Vote vote4 = new Vote("Putin");
		Vote vote5 = new Vote("Tramp");
		
		Envelop evelop1 =  new Envelop(1234 , vote1);
		Envelop evelop2 =  new Envelop(54321, vote2);
		Envelop evelop3 =  new Envelop(54321, vote3);
		Envelop evelop4 =  new Envelop(66666, vote4);
		Envelop evelop5 =  new Envelop(55555, vote5);
		election.putEnvelop(evelop1);
		election.putEnvelop(evelop2);
		election.putEnvelop(evelop3);
		election.putEnvelop(evelop4);
		election.putEnvelop(evelop5);
	 	
	 	HashMap<String, Integer> result = election.publishElectionResult();
	 	System.out.println(result);
		
	}

}
