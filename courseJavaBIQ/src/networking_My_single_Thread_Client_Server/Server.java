package networking_My_single_Thread_Client_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws InterruptedException {
		// �������� ������ �� ����� 3345

		try (ServerSocket server = new ServerSocket(3345)) {
			System.out.println("Server started , and waiting to client .");
			// ���������� � �������� ����������� � ������ ��� ������ - "client" �� ���������
			// �������
			Socket client = server.accept();

			// ����� ������������ ������ ����������� ��������������� ������� � ����
			// �������-�����������
			System.out.print("Connection accepted.");

			// ���������� ������ ��� ������� � ������, ��� �������

			// ����� ������ � �����
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			System.out.println("DataOutputStream  created");

			// ����� ������ �� ������
			DataInputStream in = new DataInputStream(client.getInputStream());
			System.out.println("DataInputStream created");

			// �������� ������ � ������������ �������� � �����, ���� ����� �� ������
			while (!client.isClosed()) {

				System.out.println("Server reading from channel");

				// ������ ��� � ������ ������ (inputstream) ��������� ������ �������
				String entry = in.readUTF();

				// ����� ��������� ������ ��������� ��
				System.out.println("READ from client message - " + entry);

				// � ������� � �������
				System.out.println("Server try writing to channel");

				// ������������� �������� ������� ����������� ������ � �������� �� ����� ������
				// �� �������� ����� - quit
				if (entry.equalsIgnoreCase("quit")) {
					System.out.println("Client initialize connections suicide ...");
					out.writeUTF("Server reply - " + entry + " - OK");
					out.flush();
					Thread.sleep(3000);
					break;
				}

				// ���� ������� ��������� ������ �� ����� - ���������� ������ - ����������
				// ���-����� ������� �������
				out.writeUTF("Server reply - " + entry + " - OK");
				System.out.println("Server Wrote message to client.");

				// ����������� ����� ������� ��������� (�� ��������� ��������� �� �����
				// ������������ � ����, � ������� ������������� � ����������� ������ ���������,
				// ������ �������� ������������ ����������� ����������� � �������, � ����� -
				// flush() ���������� ��������� �� ��������� ���������� ������ ��������
				// ���������� �������
				out.flush();

			}

			// ���� ������� ������ - ����� ��������� ����������
			System.out.println("Client disconnected");
			System.out.println("Closing connections & channels.");

			// ��������� ������� ������ ������ !
			in.close();
			out.close();

			// ����� ��������� ��� ����� ������� �� ������� �������!
			client.close();

			// ����� ��������� ����� ������� ������� ������ ������ �������
			// ���� ��� ������������� ���������� ��� ��������� �� �����
			// ��� ����������� ��������� ���� ��������� ����� ������� � �������� ������
			// �����������

			System.out.println("Closing connections & channels - DONE.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
