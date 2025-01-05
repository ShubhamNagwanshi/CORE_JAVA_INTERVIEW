package practical;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(1234);
		
		System.out.println("Server start, Waiting for a Client");
		
		Socket client = server.accept();
		
		System.out.println("Client Connect");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		out.writeBytes("Hello Client\n");
		
		String greeting = in.readLine();
		
		System.out.println("Received frrom Client: "+ greeting);
		
		client.close();
		server.close();
		
		System.out.println("Server closed");
	}
}
