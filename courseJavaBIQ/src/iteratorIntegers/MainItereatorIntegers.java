package iteratorIntegers;

public class MainItereatorIntegers {

	public static void main(String[] args) {
		int [] arr = new int[] {1,3,5,6,11};
		MyInteger integer = new MyInteger(5, arr);
		
		
		for (Integer cur : integer) {
			System.out.println(cur);
		}
	}

}
