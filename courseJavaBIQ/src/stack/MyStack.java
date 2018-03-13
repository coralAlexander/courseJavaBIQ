package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack<T> {
    private int[] intim;
    private T[] stack;
    private int pos;
    private  int  capacity;
    
    public MyStack(int capacity) {
       this.capacity=capacity; 
    	stack = (T[])new Object[capacity];
    	intim = new int [6];
    	System.out.println(Arrays.toString(stack));
    	System.out.println(Arrays.toString(intim));
    }

    public void push(T value) throws Exception {
      if (pos < capacity) {
    	  stack[pos++] = value; 
      }
      else {
    	  throw new FullStuckException();
      }
    }

    public T pop() {
        --pos;
        T num = stack[pos];
        stack[pos] = null;
        return num;
    }
}
