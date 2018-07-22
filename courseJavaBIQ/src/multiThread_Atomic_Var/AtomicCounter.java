package multiThread_Atomic_Var;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

	private AtomicInteger c = new AtomicInteger(0);

	public void increment() { 
		 for(int i=0 ; i<1000 ; i++ ) {
		c.incrementAndGet(); 
		
		 }
	}	
	
	
	public void decrement() {
		 for(int i=0 ; i<1000 ; i++ ) {
		c.decrementAndGet(); 
		 }
	} 
	
	
	public int value() { return c.get(); 
	
	}
}
