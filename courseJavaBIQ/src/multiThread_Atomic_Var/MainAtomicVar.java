package multiThread_Atomic_Var;

public class MainAtomicVar {

	public static void main(String[] args) throws InterruptedException  {
	   
		//Counter counter = new Counter();
		AtomicCounter atomic = new AtomicCounter();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
					//counter.increase();
				atomic.increment();
				}
		});
		thread.start();
		//counter.decrease();
		atomic.decrement();
		thread.join();
		//System.out.println(counter.getParam());
		System.out.println(atomic.value());
	}  
	
}
