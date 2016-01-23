package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetaddressTest2 {
	public static void main(String[] args){	
		try {
			InetAddress[] addresses = InetAddress.getAllByName("123.23.23.211");
			for(InetAddress address: addresses)
				System.out.println(address.getHostName());
		} catch (UnknownHostException e) {
			System.err.println("Exception occured!!!");
		}
	
	}

}
