package Sockets;

import java.io.IOException;
import java.io.InputStream;

class DatagramServerTask extends Thread {
	@SuppressWarnings("unused")
	private InputStream in = null;
	
	public DatagramServerTask() throws IOException{
		this("Quote Server");
	}

	public DatagramServerTask(String string) throws IOException{
		super(string);
	}
	
	@Override
	public void run(){
	}
}

public class DatagramSocketServerTest {

}
