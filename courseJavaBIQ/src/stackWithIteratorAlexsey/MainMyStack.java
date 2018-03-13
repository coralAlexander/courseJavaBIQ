package stackWithIteratorAlexsey;

import java.util.Iterator;

public class MainMyStack {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        try {
            myStack.push(3);
            myStack.push(5);
            myStack.push(8);
            myStack.push(8);
            myStack.pop();
            myStack.pop();
            myStack.push(11);
            myStack.push(22);


           Iterator<Integer> itr = myStack.iterator();

            while(itr.hasNext()) {
                System.out.println(itr.next());
            }


        }catch (MyException e){}
    }
}
