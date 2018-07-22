package multiThread_ThreadLocal;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
	  
		Counter counter = new Counter();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(counter.countTheSameWords(counter.readFromFile()));
			}
		});
		thread.start();
		System.out.println(counter.countTheSameWords(counter.readFromFile()));
	}
	
}
