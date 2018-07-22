package multiThread_Wait_Notify;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Drop drop = new Drop();

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					String str = drop.take();
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {}
					System.out.println("Out put message : " + str);
				}
			}
		});
		thread.start();

		while (true) {
			System.out.println("Please enter : ");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			drop.put(str);
		}
	}
}