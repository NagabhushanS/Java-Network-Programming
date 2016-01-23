package Sockets;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPEchoServer {
	private static final Scanner rock = new Scanner(System.in);
	
	public static void main(String[] args){
		int portNumber = 1201;
		
		try(ServerSocket serverSocket = new ServerSocket(portNumber);
				Socket connectionSocket = serverSocket.accept()) {
			try(InputStream in = connectionSocket.getInputStream(); 
					BufferedOutputStream out = new BufferedOutputStream(connectionSocket.getOutputStream())){
				while (true){
					int c;
					StringBuilder s1 = new StringBuilder();
					while ((char)(c = in.read()) != '\r'){
						s1.append((char)c);
					}
					if (s1.equals("quit")){
						break;
					}
					System.out.println("Server received: " + s1);
					System.out.print("What to send to client: ");
					String s = rock.nextLine() + '\r';
					if (s.equals("quit\r")){
						out.write("quit\r".getBytes("UTF-8"));
						out.flush();
						break;
					}
					out.write(s.getBytes("UTF-8"));
					out.flush();
					
				}
			}
		} catch (IOException e) {
			System.err.println("IOException");
		}
	}
}
