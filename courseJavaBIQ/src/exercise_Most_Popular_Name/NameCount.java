package exercise_Most_Popular_Name;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NameCount {

	public static void main(String[] args) {
		
		ArrayList <HashMap<String, Integer>> arrayList = new ArrayList<HashMap<String,Integer>>();
		
		HashMap<String, Integer> map2010 = new HashMap<>();
		map2010.put("Ponik",3);
		map2010.put("Vasia", 1);
		map2010.put("Momo", 3);
		
		HashMap<String,Integer> map2011 = new HashMap<>();
		
		map2011.put("Vasia", 1);
		map2011.put("Momo", 10);
		map2011.put("Ponik",1);		
		
		HashMap<String,Integer> map2012 = new HashMap<>();
		map2012.put("Vasia", 1);
		map2012.put("Momo", 10);	
		
		arrayList.add(map2010);
		arrayList.add(map2011);
		arrayList.add(map2012);
		System.out.println(agregate(arrayList));
    }
	private static HashMap<String,Integer> agregate(ArrayList<HashMap<String, Integer>> arrayList) {
		HashMap<String, Integer> commonMap = new HashMap<>();
		for (HashMap<String, Integer> hashMap : arrayList) {
			   for(Entry<String, Integer> name2freq : hashMap.entrySet()) {
				  String name =  name2freq.getKey();
				  int value = name2freq.getValue();   
			    if(commonMap.containsKey(name)) {
					 int tempNameFreq = commonMap.get(name)+value;
						 commonMap.put(name, tempNameFreq);
				}
				else {
					     commonMap.put(name, value);
		        }	 
		    }
	    }
		return commonMap;
    }
}

