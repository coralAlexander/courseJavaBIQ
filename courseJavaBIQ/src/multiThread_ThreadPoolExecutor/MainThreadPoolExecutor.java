package multiThread_ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPoolExecutor {

	public static void main(String[] args) {
		
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();
		Task task4 = new Task();
		Task task5 = new Task();
		
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(task1);
		ex.execute(task2);
		ex.execute(task3);
		ex.execute(task4);
		ex.execute(task5);
		
	}
   
	
	
	
}
