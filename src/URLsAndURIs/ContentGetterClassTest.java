package URLsAndURIs;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetterClassTest {
	public static void main(String[] args){
		try {
			URL myURL = new URL("http://www.w3schools.com/html/html_examples.asp");
			Class<?>[] classes = {String.class, Reader.class, InputStream.class};
			Object o = myURL.getContent(classes);
			if (o instanceof String){
				System.out.println(1);
				System.out.println(o);
			} else if (o instanceof Reader){
				System.out.println(2);
				int c;
				while ((c = ((Reader) o).read()) != -1){
					System.out.print((char)c);
				}
			} else if (o instanceof InputStream){
				System.out.println(3);
				int c;
				while ((c = ((InputStream) o).read()) != -1){
					System.out.write(c);
				}
			} else{
				System.out.println(
						"Sorry no avilable object representation of specified class is available");
			}
			
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL");
		} catch (IOException e) {
			System.err.println("No object representation retrieved!");
		}
		
	}

}
