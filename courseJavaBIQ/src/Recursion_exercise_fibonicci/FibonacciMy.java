package Recursion_exercise_fibonicci;

public class FibonacciMy {

	public static int fibo(int num) {
		if (num==1||num==2) {
			return 1;
		}
		else {
			return fibo(num-1) + fibo(num-2);	
			
			//(5) --- 3 >  (4)  2 <--> (3) -->  2 > (2) 1 |  (5) 2 <--> (3)(1)
			//  
		}
	}
	
	public static void main(String[] args) {
		
       for(int i=1 ; i < 10 ; i++) {
    	  
       int result = fibo(i);
           
       System.out.println("Place num : " + result);
       }
       
	}

}
