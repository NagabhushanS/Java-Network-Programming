package URLConnection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadWebPage {
	public static void main(String[] args){
		try {
			URL myURL = new URL("http://csb.stanford.edu/class/public/pages/sykes_webdesign/05_simple.html");
			URLConnection connection = myURL.openConnection();
			connection.connect();
			try(BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
					BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("sampleFile"))){
				int c;
				while ((c = in.read()) != -1){
					System.out.write(c);
				}
			}
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		} 
		
	}

}
