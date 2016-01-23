package Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DictionaryClient {
	public static void main(String[] args){
		try(Socket socket = new Socket("dict.org", 2628);
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream()){
			String requestString = "DEFINE eng-lat book\r\n";
			byte[] byteArray = requestString.getBytes("ASCII");
			out.write(byteArray);
			out.flush();
			int c;
			while ((c = in.read()) != -1){
				System.out.write(c);
			}
			out.write("quit\r\n".getBytes());
			out.flush();
		} catch (IOException e) {
			System.err.println("Error!");
		}
	}

}
