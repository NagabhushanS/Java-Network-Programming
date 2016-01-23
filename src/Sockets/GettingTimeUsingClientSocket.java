package Sockets;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingTimeUsingClientSocket {
	public static void main(String[] args){
		try(Socket clientSocket = new Socket("time.nist.gov", 13); 
				InputStreamReader in = new InputStreamReader(clientSocket.getInputStream(), "ASCII")){
			clientSocket.setSoTimeout(15000);
			StringBuilder builder = new StringBuilder();
			for( int c=in.read(); c!=-1; c=in.read()){
				builder.append((char)c);
			}
			DateFormat format = new SimpleDateFormat("yy-MM-dd hh:mm:ss z");
			String[] date = builder.toString().split(" ");
			String dateString = date[1] + " " + date[2] + " UTC";
			try {
				Date dates = format.parse(dateString);
				System.out.println(dates);
			} catch (ParseException e) {
				System.err.println("Invalid date format!");
			}
		} catch (IOException e){
			System.err.println("Error connecting to the server!");
		}
	}

}
