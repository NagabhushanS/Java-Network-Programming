package URLsAndURIs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadingWebPageUsingURL {
	
	public static void main(String[] args){
		try(FileOutputStream out = new FileOutputStream("sampleFile")) {
			URL myURL = new URL("http://www.w3schools.com/html/html_examples.asp");
			InputStream in = myURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in), 1024);
			int c;
			while ((c = reader.read()) != -1){
				out.write((byte)c);
			}
		} catch (MalformedURLException e) {
			System.err.println("Error");
		} catch (IOException e){
			
		}
		
	}

}
