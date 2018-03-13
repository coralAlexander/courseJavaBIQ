package palidromic;

public class array8 {

	public static void main(String[] args) {
		boolean palindromic = true;
		int[] numbers = {1,2,3,4,3,2,1};

	for (int i = 0; i < numbers.length; i++) {
		if (!(numbers[i] == numbers[(numbers.length-1)-i] )) {
			palindromic  = false;
			break;	
		}	   
    }
	    if (palindromic) {
	    	System.out.println("array is Palindromic one");
	    }
	    else {
	    	System.out.println("array is not Palindromic one");
	    }
	    
	
  }

}
