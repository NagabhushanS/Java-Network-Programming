package Sockets;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketAddressTest {

	public static void main(String[] args) {
		try (Socket socket = new Socket("download.java.net", 80, InetAddress.getLocalHost(), 0)) {
			socket.setSoTimeout(10000);
			SocketAddress local = socket.getLocalSocketAddress();
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			SocketAddress remote = socket.getRemoteSocketAddress();
			System.out.println(local);
			System.out.println(remote);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
