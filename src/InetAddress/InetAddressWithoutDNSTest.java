package InetAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressWithoutDNSTest {
	public static void main(String[] args){
		try {
			InetAddress address = InetAddress.getByName("208.201.239.100");
			System.out.println(address.getCanonicalHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
