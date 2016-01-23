package Sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintingInetAddresses {
	public static void main(String[] args){
		try {
			InetAddress myAddress = InetAddress.getLocalHost();
			System.out.println(myAddress);
		} catch (UnknownHostException e) {
			System.err.println(
					"Weird! Couldn't locate the local host! Please check your internet connection");
		}
		
		for (String arg: args){
			try {
				InetAddress[] addresses = InetAddress.getAllByName(arg);
				for (InetAddress address: addresses){
					System.out.println(address);
				}
			} catch (UnknownHostException e) {
				System.exit(1);
			}
		}
		
	}
}
