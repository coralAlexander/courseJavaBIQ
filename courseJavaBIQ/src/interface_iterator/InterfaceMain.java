package interface_iterator;

public class InterfaceMain {

	public static void main(String[] args) {
      
		MyString s = new MyString("Hello!!!");
		
		for (Character c : s) {
			System.out.println(c);
		}
     }
}