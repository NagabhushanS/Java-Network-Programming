package URLsAndURIs;

import java.net.URI;
import java.net.URISyntaxException;

public class URIGettersTest {
	public static void main(String[] args){
		try {
			URI myURI = new URI("http://www.youtube.com/%24videos/hello.mp4?123#ref");
			System.err.println(myURI.getSchemeSpecificPart());
		} catch (URISyntaxException e) {
			System.err.println("URI Syntax Exception!");
		}
		
	}

}
