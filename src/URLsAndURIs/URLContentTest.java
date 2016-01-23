package URLsAndURIs;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLContentTest {
	public static void main(String[] args){
		try {
			URL myURL = new URL(
					"https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=The%20greatest%20movie");
			Class<?>[] classes = {String.class, Reader.class, InputStream.class};
			Object object = myURL.getContent(classes);
			switch (object.getClass().getName()){
			case "String":
				System.out.println("String");
				break;
			case "Reader":
				System.out.println("Reader");
				break;
			case "InputStream":
				System.out.println("InputStream");
				break;
			default:
				System.out.println("default" + object.getClass().getName());
			}
		} catch (MalformedURLException e) {
			System.err.println("Protocol is not supported!");
		} catch (IOException e) {
			System.err.println("IOException!");
		}
		
	}

}
