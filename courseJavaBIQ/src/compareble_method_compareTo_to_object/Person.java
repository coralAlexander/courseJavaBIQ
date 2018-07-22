package compareble_method_compareTo_to_object;

public class Person implements Comparable<Person> {
  private String name ;
  private int age ;
  public Person (String name, int age) {
	  
	  this.name=name;
	  this.age=age;
  }
 


@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}



@Override
public int compareTo(Person o) {
	int compareVal = name.compareTo(o.name);
	return compareVal == 0? age - o.age : compareVal;
   }
}
