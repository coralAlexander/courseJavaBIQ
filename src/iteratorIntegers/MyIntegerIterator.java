package iteratorIntegers;

import java.util.Iterator;

public class MyIntegerIterator implements Iterator<Integer> {

	private int[] arr;
	private int pos=-1;

	public  MyIntegerIterator (int[] arr) {
		this.arr=arr;
	}
	

	@Override
	public boolean hasNext() {
		return pos+1<arr.length;
	}

	@Override
	public Integer next() {
		
		return arr[++pos];
	}

}
