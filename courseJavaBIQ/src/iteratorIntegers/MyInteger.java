package iteratorIntegers;

import java.util.Iterator;

public class MyInteger implements Iterable<Integer> {

	private int [] arr ;
	private int capacity;
	
	public MyInteger(int capacity, int[] arr) {
		this.capacity=capacity;
		this.arr=arr;
	}
	
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new MyIntegerIterator(arr);
	}

}
