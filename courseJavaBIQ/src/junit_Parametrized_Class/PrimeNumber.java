package junit_Parametrized_Class;

public class PrimeNumber {
	
    public  boolean ifNumberIsPrime (int num){
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
