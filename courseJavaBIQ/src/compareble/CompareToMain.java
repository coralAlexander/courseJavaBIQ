package compareble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareToMain {
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList() ;
		Person p1 = new Person("Alex1",30);
		Person p2 = new Person("Alex",20);
		
		//p1.compareTo(p2);
		
		list.add(p1);
		list.add(p2);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
	
	
	
	
	

}
