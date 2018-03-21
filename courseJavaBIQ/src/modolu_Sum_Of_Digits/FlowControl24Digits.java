package modolu_Sum_Of_Digits;

public class FlowControl24Digits {

	public static void main(String[] args) {
		int number =12443;
		int count = 0;
		int sum = 0 ;
		while(number > 0) {
			int tempNum = number%10;
			sum = sum + tempNum;
			number =number/10;	
			count++;	
		}
        System.out.println(count + " "+  sum);
	}

}
