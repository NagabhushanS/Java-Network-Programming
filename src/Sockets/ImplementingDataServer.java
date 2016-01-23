package Sockets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

class DateServerTask extends Thread {
	private Socket connection;

	public DateServerTask(Socket connection) {
		this.connection = connection;
	}

	@Override
	public void run() {
		try {
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			Date date = new Date();
			out.write(date + "\r\n");
			out.flush();
		} catch (IOException e) {
			System.out.println(e);
		} finally{
			try {
				connection.close();
			} catch (IOException e) {
			}
		}
	}
}

public class ImplementingDataServer {
	private static final int portNumber = 80;

	public static void main(String[] args) {
		try (ServerSocket socket = new ServerSocket(portNumber)) {
			while (true) {
				try {
					Socket connection = socket.accept();
					DateServerTask task = new DateServerTask(connection);
					task.start();
				} catch (IOException e) {
					System.out.println("Error!");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
			System.out.printf("Server couldn't be established!");
		}

	}

}
