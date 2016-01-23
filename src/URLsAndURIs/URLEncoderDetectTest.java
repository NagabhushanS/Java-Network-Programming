package URLsAndURIs;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEncoderDetectTest {
	public static void main(String[] args){
		try {
			//String stringURI = URLEncoder.encode("http://www.w3schools.com/js/", "UTF-8");
			URL url = new URL("http://www.w3schools.com/js/");
			try(InputStream in = url.openStream(); BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("sampleFile"), 1000)){
				int c;
				while ((c = in.read()) != -1){
					out.write(c);
				}
			}
		} catch (UnsupportedEncodingException e) {
			System.err.println("No such unicode encoding scheme!");
		} catch (MalformedURLException e) {
			System.err.println("Wrong protocol!");
		} catch (IOException e){
			System.err.println("No such web page exists!");
		}
		
	}

}
