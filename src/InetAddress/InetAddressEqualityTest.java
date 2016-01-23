package InetAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEqualityTest {
	public static void main(String[] args) {
		try {
			InetAddress address1 = InetAddress.getByName("www.youtube.com");
			InetAddress address2 = InetAddress.getByName("bom05s05-in-f14.1e100.net");
			if (address1.equals(address2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
