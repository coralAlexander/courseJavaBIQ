package multiThread_ThreadPoolExecutor;

public class Task implements Runnable{

	@Override
	public void run() {

		print();
			//System.out.println(Thread.currentThread().getId());
	}

	
	public static void print () {
		System.out.println(Thread.currentThread().getId());
	}
}
