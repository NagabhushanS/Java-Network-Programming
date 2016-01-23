package InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ListingNetworkInterfaces {
	public static void main(String[] args){
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()){
				NetworkInterface myInterface = interfaces.nextElement();
				System.out.println(myInterface.getName() + ": " + (myInterface.getInetAddresses().hasMoreElements() ? myInterface.getInetAddresses().nextElement():""));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		
	}

}
