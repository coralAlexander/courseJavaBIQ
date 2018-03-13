package hashMapObjecInKey;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainHashMap {
	public static void main(String[] args) {
		
		Map<Person,Integer> map = new HashMap<>();
		Person p1 = new Person("Pups");
		Person p2 = new Person("Mops");
		Person p3 = new Person("Pups");
		
		
		map.put(p1,7);
		map.put(p2,10);
		
		
		int numOfBooks1 = map.get(p1);
		int numOfBooks3  = map.get(p3);
		int numOfBooks2 = map.get(p2);
		
		System.out.println(numOfBooks1  + "  "+numOfBooks3);
	}

}
