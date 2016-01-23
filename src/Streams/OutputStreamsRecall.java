package Streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OutputStreamsRecall {
	public static void main(String[] args){
		Writer out = null;
		try{
			out = new FileWriter(new File("sampleFileMine2"));
			char [] byteArray = "Hello this is Nagabhushan".toCharArray();
			for(int i=0; i<byteArray.length; i++){
				out.write(233);
			}
		} catch(IOException e){
			System.err.println("Error in opening the file");
		} finally{
			if (out != null){
				try{
					out.close();
				} catch(IOException e){
					
				}
			}
		}
		
		
	}

}
