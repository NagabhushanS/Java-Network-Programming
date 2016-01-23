package URLsAndURIs;

import java.net.MalformedURLException;
import java.net.URL;

public class RelativeURLTest {
	public static void main(String[] args){
		try {
			URL abs = new URL("http://www.w3schools.com/html/html_examples.asp");
			URL relativeURL = new URL(abs, "hello.mp4");
			System.out.println(relativeURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
