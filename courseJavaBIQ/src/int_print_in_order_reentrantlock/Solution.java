package int_print_in_order_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {

    private int treadNumber;

    Solution(int treadNumber){
        this.treadNumber = 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Runnable runnable = new Thread();
        printFirst(runnable,lock);
    }

    public static void printFirst(Runnable printFist , Lock lock) throws InterruptedException{

    }
}
