package classes_phoneBook;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBook phoneBook = new PhoneBook();
		Contact contact1 =  new Contact("Vasia", 666666);
		Contact contact2 =  new Contact("Petia",444444);
		Contact contact3 =  new Contact("Vasia",3333);
		phoneBook.addContact(contact1);
		phoneBook.addContact(contact2);
		phoneBook.addContact(contact3);
		phoneBook.deleteByName("Vasia");
		phoneBook.print();

	}

}
