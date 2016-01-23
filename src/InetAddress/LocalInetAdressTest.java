package InetAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalInetAdressTest {
	public static void main(String[] args){
		try {
			InetAddress myAddress = InetAddress.getByName("www.youtube.com");
			byte[] ipAddress = myAddress.getAddress();
			for (byte ipByte: ipAddress){
				System.out.println(ipByte > 0 ? ipByte : ipByte + 256);
				
			}
			System.out.println(myAddress.getCanonicalHostName());
			
		} catch (UnknownHostException e) {
			System.out.println("Error locating the local host");
		}
	}
	

}
