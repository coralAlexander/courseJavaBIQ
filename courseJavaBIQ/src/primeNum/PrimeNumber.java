package primeNum;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for (String str : args) {
			String newString = str.replaceAll(" ", "");
			int num = Integer.parseInt(newString);
			if (returString(num)) {
				System.out.println(newString+"   is a Prime number");
				
			}
			else {
				System.out.println(newString+ "  is not a Prime number  ");
			}	
		}
	}
    public static boolean returString (int num){
    	if (num==1) {
    		return false;
    	}
    	else {
    		for (int i = 2; i*i <= num; i++) {
    			
    			if (num%i==0) {
    				return false;
    				
    			}	
			}
    	}
	    
	    return true; 
    	
    }
}
