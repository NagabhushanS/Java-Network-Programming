package URLsAndURIs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetterTest {
	public static void main(String[] args){
		try {
			URL myURL = new URL("http://www.w3schools.com/html/html_examples.asp");
			Object o = myURL.getContent();
			System.out.println("The object is an instance of " + o.getClass().getName());
			
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL");
		} catch (IOException e){
			
		}
		
		
	}

}
