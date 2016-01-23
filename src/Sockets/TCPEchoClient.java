package Sockets;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient {
	private final static Scanner rock = new Scanner(System.in);

	public static void main(String[] args) {
		String serverName = "nagabhushan";
		int port = 1201;

		try (Socket clientSocket = new Socket(serverName, port, null, 0)) {
			try (InputStream in = clientSocket.getInputStream();
					BufferedOutputStream out = new BufferedOutputStream(clientSocket.getOutputStream())) {
				while (true) {
					System.out.print("What to send to server: ");
					String s = rock.nextLine() + '\r';
					if (s.equals("quit\r")) {
						out.write("quit\r".getBytes("UTF-8"));
						out.flush();
						break;
					}
					out.write(s.getBytes("UTF-8"));
					out.flush();
					int c;
					StringBuilder s1 = new StringBuilder();
					while ((char) (c = in.read()) != '\r') {
						s1.append((char) c);
					}
					if (s1.equals("quit")){
						break;
					}
					System.out.println("Client received: " + s1);

				}
			}
		} catch (UnknownHostException e) {
			System.err.println("UnknownHostException");
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
