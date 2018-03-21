package random_and_Scanner_20GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class FlowControl20 {

	public static void main(String[] args) {
		int myint = 0;
		int  randomNumber=0;
		int max = 100;
		int min = 1;
		
		while( myint != -99) {
		    
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter an Integer");
			myint = keyboard.nextInt();
			
			Random rand = new Random();
			randomNumber = rand.nextInt(max - min+1) + min;
			if (myint == randomNumber) {
				System.out.println("the guess is correct and the number of guesses");
			}
			else {
				if (myint<randomNumber) {
					System.out.println("selected number is below");
				}
				else {
					System.out.println("selected number is above");
				}
			}
		}

		
	}

}
