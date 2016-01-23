package URLsAndURIs;

import java.net.MalformedURLException;
import java.net.URL;

public class SplittingURLTest {
	public static void main(String[] args){
		try {
			URL myURL = new URL("http://www.youtube.com/videos/hello.mp4?query=23#23434");
			System.out.println(myURL.getProtocol());
			System.out.println(myURL.getFile());
			System.out.println(myURL.getHost());
			System.out.println(myURL.getPort());
			System.out.println(myURL.getAuthority());
			System.out.println(myURL.getPath());
			System.out.println(myURL.getUserInfo());
			System.out.println(myURL.getQuery());
			System.out.println(myURL.getRef());
			System.out.println(myURL.getDefaultPort());
			;
			
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL");
		}
		
	}

}
