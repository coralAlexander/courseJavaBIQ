package multiThread_Atomic_Var;

public class Counter {

    private int param;


    public void increase() {
        for (int i = 0; i < 1000; i++) {
            // synchronized (this) {
            param++;
            //System.out.println("Thread Id : "+Thread.currentThread().getId()+" sumThreeDifferentWays is  : " + param);
            //}

        }
    }

    public void decrease() {
        for (int i = 0; i < 1000; i++) {
            // synchronized (this) {
            param--;
            //System.out.println("Thread Id : "+Thread.currentThread().getId()+"  sumThreeDifferentWays is  : " + param);

            //}

        }
    }

    public int getParam() {
        return param;
    }

}
