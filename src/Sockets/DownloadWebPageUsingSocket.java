package Sockets;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DownloadWebPageUsingSocket {
	public static void main(String[] args){
		try(Socket webClient = new Socket("developer.android.com", 80); 
				OutputStreamWriter out = new OutputStreamWriter(webClient.getOutputStream(), "8859_1");
				InputStreamReader in = new InputStreamReader(webClient.getInputStream(), "ASCII")){
			System.out.println(webClient);
			out.write("GET /intl/ja/index.html HTTP 1.0\r\n\r\n");
			out.flush();
			for (int c = in.read(); c != -1; c = in.read()){
				System.out.write(c);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
