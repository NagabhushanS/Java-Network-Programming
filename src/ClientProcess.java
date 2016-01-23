import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientProcess {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int port = 1234;
		try {
			InetAddress local = InetAddress.getByName("");
			Socket clientSocket = new Socket(local, port);
			try (Writer writer = new OutputStreamWriter(clientSocket.getOutputStream());
					Reader reader = new InputStreamReader(clientSocket.getInputStream())) {
				while (true) {
					System.out.print("Client: ");
					String s = in.nextLine();
					writer.write(s + "\r");
					writer.flush();
					int c;
					StringBuilder builder = new StringBuilder();
					while ((c = reader.read()) != '\r') {
						builder.append((char) c);
					}
					System.out.println("Server: " + builder.toString());
				}
			}
		} catch (IOException e) {
			System.err.println("Connection problem");
		}

	}

}
