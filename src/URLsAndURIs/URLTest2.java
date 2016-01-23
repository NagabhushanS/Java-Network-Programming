package URLsAndURIs;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		try {
			URL myURL = new URL("http://sammpleURL");
			try(InputStream in = myURL.openStream()){
				int c;
				int butesAvailable = in.available();
				byte[] bytes = new byte[butesAvailable];
				in.read(bytes, 0, butesAvailable);

			}
		} catch (IOException e) {
			System.err.println("That url doen't exists");
		}

	}

}
