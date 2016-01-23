import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDownload {
	public static void main(String[] args){
		try {
			URL myURL = new URL("file:C:\\ds.txt");
			URLConnection conn = null;
			try {
				conn = myURL.openConnection();
			} catch (IOException e1) {
				System.out.println("Error1");
			}
			try(InputStream in = conn.getInputStream();){
				BufferedInputStream inn = new BufferedInputStream(in);
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("theFile")));
				int c;
				while((c=inn.read())!= -1){
					writer.write(c);
					writer.flush();
				}
			} catch(IOException e){
				System.out.println("Error3");
			}
			
		} catch (MalformedURLException e) {
			System.out.println("Error2");
			e.printStackTrace();
		}
		
		
	}
	
}
