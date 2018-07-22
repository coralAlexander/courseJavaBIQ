package network_Client_Server_MultiThreaded;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		
		Socket socket = null ;
		DataInputStream inputStream;
		DataInputStream userInput;
		PrintStream outputStream;
        
		String line = "";
		try {
			socket = new Socket("localhost", 7000);
			inputStream = new DataInputStream(socket.getInputStream());
			outputStream = new PrintStream(socket.getOutputStream());
			userInput = new DataInputStream(System.in);
			while(!line.equals("!")) {
			 line = userInput.readLine();
			 outputStream.println(line);
			 System.out.println(inputStream.readLine());
			}
		}
		catch (Exception e) {
			System.err.println(e);
		}
		finally {	
			try {
			socket.close();	
			}
			catch (Exception e) {
				// log and ignore
			}
			
		}
	}

}
