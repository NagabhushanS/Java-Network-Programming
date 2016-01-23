import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProcess {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int port = 1234;
		try (ServerSocket socket = new ServerSocket(port)) {
			try (Socket connection = socket.accept()) {
				try (InputStreamReader reader = new InputStreamReader(connection.getInputStream());
						OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream())) {

					while (true) {
						int c;
						StringBuilder builder = new StringBuilder();
						while ((c = reader.read()) != '\r') {
							builder.append((char) c);
						}
						if (builder.toString().equals("quit")) break;
						System.out.println("Client: " + builder.toString());
						System.out.print("Server: ");
						writer.write(in.nextLine() + "\r");
						writer.flush();
					}
				}

			}
		} catch (IOException e) {
			System.err.println("Error");
		}
	}

}
