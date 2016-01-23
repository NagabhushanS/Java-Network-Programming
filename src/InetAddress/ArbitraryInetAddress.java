package InetAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ArbitraryInetAddress {
	
	public static void main(String[] args){
		byte[] ipAddress = {(byte)234, 23, 0, 1};
		try {
			InetAddress arbAddress = InetAddress.getByAddress("nagabhushan", ipAddress);
			System.out.println(arbAddress.getHostAddress() + ": " + arbAddress.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
