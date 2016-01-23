package Streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		for(int i=0; i<100; i++){
			out.write(i);
		}
		try {
			out.close();
		} catch (IOException e) {
			
		}
		byte[] byteArray = out.toByteArray();
		for(int k=0; k<byteArray.length; k++){
			System.out.write(byteArray[k]);
			System.out.print(" ");
		}
		

	}

}
