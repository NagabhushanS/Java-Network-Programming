package URLConnection;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadWebPageUsingHTTPHeader {
	public static void main(String[] args) {
		try {
			URL myURL = new URL("http://www.livecareer.com/resume-examples");
			URLConnection connection = myURL.openConnection();
			connection.connect();
			String encoding = connection.getContentType()
					.substring(connection.getContentType().indexOf("charset=") + 8);
			System.out.println(connection.getContentEncoding());
			try (Reader in = new InputStreamReader(new BufferedInputStream(connection.getInputStream()),
					encoding.toUpperCase());
					BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("sampleFile"))) {
				int c;
				while ((c = in.read()) != -1) {
					out.write(c);
				}
			}
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
