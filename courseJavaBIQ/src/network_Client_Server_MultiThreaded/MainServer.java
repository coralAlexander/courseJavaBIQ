package network_Client_Server_MultiThreaded;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) throws IOException {

		Socket socket = null;
		
		try (ServerSocket server = new ServerSocket(7000)) {
			while (true) {
				socket = server.accept(); // blocking
				handleClient(socket);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void handleClient(Socket socket) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					DataInputStream inputStream;
					PrintStream outputStream;
					String line = "";
					inputStream = new DataInputStream(socket.getInputStream());
					outputStream = new PrintStream(socket.getOutputStream());
					while (!line.equals("!")) {

						line = inputStream.readLine();
						outputStream.println(line);
						System.out.println(line);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();	
	}
}
