package multiThread_Wait_Notify;

public class Drop {
	private String message;
	private boolean empty = true;

	
	public synchronized String take() {
		// Wait until message is available
		while (empty) {
			// we do nothing on InterruptedException
			// since the while condition is checked anyhow			
			try { wait(); } catch (InterruptedException e) {} 
		}
		// Toggle status and notify on the status change
		empty = true;
		notifyAll();
		return message;
	}

	public synchronized void put(String message) {
		// Wait until message has been retrieved
		while (!empty) {
			// we do nothing on InterruptedException
			// since the while condition is checked anyhow			
			try { wait(); } catch (InterruptedException e) {}
		}
		// Toggle status, store message and notify consumer
		empty = false;
		this.message = message;
		notifyAll();
	}

	
}
