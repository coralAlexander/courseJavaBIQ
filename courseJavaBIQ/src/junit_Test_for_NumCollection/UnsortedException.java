package junit_Test_for_NumCollection;

public class UnsortedException extends Exception {
	String message;
	
	public UnsortedException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

}
