package recursion_NIM_Game;

import java.util.EmptyStackException;
import java.util.Scanner;


public class Nim_My_Solution {

	static int [] pillar = {5,5,5};
	static String player ;
	
	public static void main(String[] args) {
			
		while(!(pillar[0] ==0) || !(pillar[1] ==0) || !(pillar[2] ==0) ){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter an Integer");
			int pilarIndex = keyboard.nextInt();
			int dicsAmount = keyboard.nextInt();
			play(pilarIndex,dicsAmount);	
		}
	}
	
	public static void play(int pilarIndex ,int dicsAmount) {	
		
		if (pillar[pilarIndex] > 0 && dicsAmount <= pillar[pilarIndex]) {
			pillar[pilarIndex] = pillar[pilarIndex] - dicsAmount ;
			System.out.println("Pillar 1 : "+ pillar[0] + "  Pillar 2 :"+ pillar[1] + " Pillar 3 :" +pillar[2]);
			System.out.println("Computer play ");
			player = "Vasia";
			computer();
			if (pillar[0] ==0 && pillar[1]==0 && pillar[2] == 0 ) {
				System.out.println("Winner is : " + player);
			}
		}
		else {
			throw new EmptyStackException();
		}
	}
	
	public static void computer() {
		if(pillar[0] > 0) {
			pillar[0] = pillar[0] - 1; 
			System.out.println("Pillar 1 : "+ pillar[0] + "  Pillar 2 :"+ pillar[1] + " Pillar 3 :" +pillar[2]);
			player = "Computer";
		}
		else if (pillar[1]> 0) {
				pillar[1] = pillar[1] - 1;
				System.out.println("Pillar 1 : "+ pillar[0] + "  Pillar 2 :"+ pillar[1] + " Pillar 3 :" +pillar[2]);
				player = "Computer";
		   }
		else if (pillar[2] > 0) {	
		pillar[2] = pillar[2] - 1;
		System.out.println("Pillar 1 : "+ pillar[0] + "  Pillar 2 :"+ pillar[1] + " Pillar 3 :" +pillar[2]);
		player = "Computer";
		}	
	}
}

