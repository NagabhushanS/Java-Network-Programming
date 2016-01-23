package Sockets;

import java.io.IOException;
import java.net.Socket;

public class CheckingActivePortsOnLocalHost {
	public static void main(String[] args) {
		for (int i = 0; i < 1024; i++) {
			try (Socket socket = new Socket("localhost", i)) {
				System.out.println("Available on: " + i);
			} catch (IOException e) {

			}
		}
	}

}
