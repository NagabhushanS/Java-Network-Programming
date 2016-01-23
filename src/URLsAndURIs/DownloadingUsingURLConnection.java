package URLsAndURIs;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadingUsingURLConnection {
	public static void main(String[] args){
		try{
			URL myURL = new URL("http://www.w3schools.com/html/html_examples.asp");
			try {
				URLConnection myURLConnection = myURL.openConnection();
				InputStream in = myURLConnection.getInputStream();
				int c;
				for (c = in.read(); c != -1; c = in.read()){
					System.out.write(c);
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e){
			System.out.println(e);
		}
		
	}

}
