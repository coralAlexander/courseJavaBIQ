package junit_My_version_Test_for_NumCollectionStrateges;

public class UnsortedException extends Exception {
	String message;
	
	public UnsortedException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

}
