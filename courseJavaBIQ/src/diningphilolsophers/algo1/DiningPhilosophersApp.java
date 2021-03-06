package diningphilolsophers.algo1;

public class DiningPhilosophersApp {

    private static final int NUM_PHILOSEPHERS = 5;

    public static void main(String[] args) throws Exception {

        // Create Threads (Dining Philosophers)
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSEPHERS];

        // Create Forks per Philosopher
        Object[] forks = new Object[NUM_PHILOSEPHERS];
        for (int i = 0; i < NUM_PHILOSEPHERS; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < NUM_PHILOSEPHERS; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % NUM_PHILOSEPHERS];

            // To get deadlock:
            // 1. Uncomment this line
             philosophers[i] = new Philosopher(leftFork, rightFork);

            // 2. Comment this 'if' block
//            if (i == NUM_PHILOSEPHERS-1) {
//                philosophers[i] = new Philosopher(leftFork, rightFork);
//            } else {
//                philosophers[i] = new Philosopher(rightFork, leftFork);
//            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
