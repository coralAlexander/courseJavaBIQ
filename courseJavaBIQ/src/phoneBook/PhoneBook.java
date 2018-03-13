package phoneBook;

import java.util.ArrayList;

public class PhoneBook {
    private final int arraySize = 3;
	private Contact contact;
	private ArrayList<Contact> arrayOfcontacts = new ArrayList<>();
	
	
	public void addContact(Contact contact) {
		try {
			if (arrayOfcontacts.size() < arraySize) {
				arrayOfcontacts.add(contact);
			} else {
				throw new IndexOutOfBoundsException("The phone book are full.");
			} 
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteByName(String name) {
		
		for (int i = 0; i < arrayOfcontacts.size(); i++) {
			if (arrayOfcontacts.get(i).getName() == name) {
				arrayOfcontacts.remove(i);
			}
			
		}
		
	}
    public void print () {
    	System.out.println(arrayOfcontacts);
    }
	/*@Override
	public String toString() {
		return "PhoneBook [arrayOfcontacts=" + arrayOfcontacts + "]";
	}*/
}
