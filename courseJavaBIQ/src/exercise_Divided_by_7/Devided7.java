package exercise_Divided_by_7;

public class Devided7 {

	public static void main(String[] args) {
		
		
		divided7(args);
	}

	public static void divided7(String[] str) {
		int upnum;
		for (String curr : str) {
		String updatedString =curr.replace(" ", "");
		 
		upnum= Integer.parseInt(updatedString);
		int nn=upnum;
		while(upnum>0) {
			if (upnum % 7 == 0||upnum%10==7) {
				  System.out.println("Divide 7 :"+ nn );
				 break;
				}
				else {
				int n =	upnum/10;
				
				upnum = n;
					
				}
		}
		}
		 
		
	}

   }

	
