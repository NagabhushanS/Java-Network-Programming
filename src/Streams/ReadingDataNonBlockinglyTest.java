package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataNonBlockinglyTest {
	public static void main(String[] args){
		String fileName = "sampleFile";
		try (FileInputStream in = new FileInputStream(fileName)){
			File file = new File(fileName);
			int bytesToBeRead = (int)file.length();
			System.out.println(bytesToBeRead);
			int bytesRead = 0;
			byte[] bytesArray = new byte[bytesToBeRead];
			while (bytesRead<bytesToBeRead){
				int result = in.read(bytesArray, bytesRead, bytesToBeRead-bytesRead);
				if (result == -1) break;
				else{
					bytesRead += result;
				}
			}
			for(int i=0; i<bytesArray.length; i++){
				System.out.write(bytesArray[i]);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
			System.exit(1);
		} catch (IOException e){ 
		}
		
	}

}
