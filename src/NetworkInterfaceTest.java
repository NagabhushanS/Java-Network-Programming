import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;

public class NetworkInterfaceTest {
	public static void main(String[] args){
		try {
			NetworkInterface interfac = NetworkInterface.getByName("eth0");
			if (interfac == null){
				System.out.println("No such network interface!");
			}
			Enumeration<NetworkInterface> enums = NetworkInterface.getNetworkInterfaces();
			while(enums.hasMoreElements()){
				NetworkInterface inf = enums.nextElement();
				System.out.println(inf.getName());
			}
		} catch (SocketException e) {
			System.err.println("Error");
		}
		
		try {
			URL url = new URL("http://www.google.com/hello/man.html?que=2#ref");
			System.out.println(url.getHost());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
