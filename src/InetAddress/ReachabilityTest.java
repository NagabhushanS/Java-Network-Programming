package InetAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;

public class ReachabilityTest {
	public static void main(String[] args){
		try {
			//Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress address = InetAddress.getByName("");
			System.out.println(address.isReachable(1000));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
