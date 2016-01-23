package URLConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InvestigatingHeaderUsingURLConnection {
	public static void main(String[] args){
		try {
			URL myURL = new URL("http://www.presenttime.com/");
			URLConnection connection = myURL.openConnection();
			connection.connect();
			System.out.println(connection.getContentLength());
			System.out.println(connection.getContentEncoding());
			System.out.println(connection.getContentType());
			System.out.println(connection.getLastModified());
			System.out.println(connection.getDate());
			System.out.println(connection.getExpiration());
			System.out.println(connection.getHeaderField("cache-control"));
			System.out.println(connection.getHeaderFieldKey(4));
		} catch (MalformedURLException e) {
			System.err.println("protocol not defined!");
		} catch (IOException e) {
			System.err.println("Error connecting to the server!");
		}
		
	}

}
