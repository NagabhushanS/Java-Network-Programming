package URLsAndURIs;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class RelativeURITest {
	public static void main(String[] args) {
		try {
			String uriString;
			try {
				uriString = URLEncoder.encode("https://www.java.com/en/", "UTF-8");
				System.out.println(uriString);
				URI abs = new URI(uriString);
				//URI rel = new URI("hello/hi.txt");
				//URI newURI = abs.resolve(rel);
				System.out.println(abs);
			} catch (UnsupportedEncodingException e) {
			}

		} catch (URISyntaxException e) {
			System.err.println(e.getClass().getName());
		}

	}

}
