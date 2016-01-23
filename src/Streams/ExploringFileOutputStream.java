package Streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExploringFileOutputStream {
	
	public static void main(String[] args){
		File myFile = new File("sampleFile");
		FileOutputStream fileObject = null;
		try {
			fileObject = new FileOutputStream(myFile);
			String message = "Hello man I am Nagabhushan How are u";
			for (int i=0; i<message.length(); i++){
				fileObject.write((int)message.charAt(i));
				fileObject.flush();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally{
			if (fileObject != null){
				try{
					fileObject.close();
				} catch (IOException e){
					// ignore
				} 
			}
		}
	}

}
