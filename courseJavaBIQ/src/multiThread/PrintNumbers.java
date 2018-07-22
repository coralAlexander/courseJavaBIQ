package multiThread;

public class PrintNumbers {

	 public void printNumbers() {
		
		for (int i = 0; i < 1000; i++) {
			synchronized (this) {
				System.out.print("Tfggfjjsjyjdkdghjkhkhkkhkhkhkhkhjkhjkhjkhjk : "+Thread.currentThread().getId() + " : " + i);
				System.out.println("  dfdffdhgjfhdjfhkfjdjshahathshashhxd");
			}
			
		}
	}
}
