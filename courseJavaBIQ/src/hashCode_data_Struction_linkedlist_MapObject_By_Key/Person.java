package hashCode_data_Struction_linkedlist_MapObject_By_Key;

public class Person {

	private String name ;
	private int booksNum;
	public Person (String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof Person && ((Person)o).name.equals(name));
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", booksNum=" + booksNum + "]";
	}
	

	
}
