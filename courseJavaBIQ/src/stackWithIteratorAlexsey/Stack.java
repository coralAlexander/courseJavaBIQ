package stackWithIteratorAlexsey;

import java.util.Iterator;

public class Stack implements Iterable<Integer>{
    protected int capacity;
    protected int pointer=0;
    protected int[] stackArray;

    public Stack(int capacity){
        stackArray = new int [capacity];
        this.capacity=capacity;

    }


    public void push (int number) throws MyException {
        if(pointer>=capacity){
            throw new MyException();
        };
        stackArray[pointer++] = number;
    }

    public int pop(){

        return stackArray[--pointer];

    }

    public Iterator<Integer> iterator() {
        return new MyStackIterator( stackArray, pointer );
    }
}
