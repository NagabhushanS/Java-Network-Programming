package InetAddress;
import java.net.Inet6Address;
import java.net.UnknownHostException;

public class InetAddressSubclassesTest {
	public static void main(String[] args){
		try {
			Inet6Address address = (Inet6Address) Inet6Address.getByName("::7A23:219B");
			if (address.isIPv4CompatibleAddress()){
				System.out.println("True");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
	}

}
