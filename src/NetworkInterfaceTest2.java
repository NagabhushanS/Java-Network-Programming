import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceTest2 {
	public static void main(String[] args){
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()){
				System.out.println(interfaces.nextElement().getName());
			}
			
		} catch (SocketException e) {
		}
		
	}

}
