package phoneBook;

public class Contact {

	private String name;
	private int number;
	
	public Contact(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setNumber (int number) {
		this.number=number;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}
}
