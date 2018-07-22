package exceptions;

public class Exeptions {

	public static void main(String[] args) {
		
		double [] [] numbers = {{5,5},{0,0},{-1,0.5},{7,7}};
		for (double[] number : numbers) {
		try {
			double resultCurrent  = pow(number[0],number[1]);
			System.out.println(number[0] + "/  " + number[1]+ "  "+ resultCurrent );
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}			
	}

	}
	 public static double pow (double number , double number2) {
		 double result;
		 if (number2 == 0 && number==0) {
			 throw new ArithmeticException("Incorrect values") ;
		 }
		 else {
		 result = Math.pow(number, number2);
		      if(Double.isInfinite(result) || Double.isNaN(result) ) {
		    	  throw new ArithmeticException(" Incorrect") ; 
		      }
		 } 
		  return result ;
		}
}
   
