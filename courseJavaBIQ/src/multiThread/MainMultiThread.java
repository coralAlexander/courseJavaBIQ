package multiThread;

public class MainMultiThread {

	public static void main(String[] args) {
		

		PrintNumbers print = new PrintNumbers();
		System.out.println("Main ThreadId: " + Thread.currentThread().getId());
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					print.printNumbers();
				}
			});
			thread.setDaemon(true);
			thread.start();
		}
		print.printNumbers();
	}
}
