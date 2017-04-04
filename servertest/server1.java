package servertest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		server1 Server = new server1(); //creating server
		Server.run(); //running the server
	}

	private void run() throws Exception {
		// TODO Auto-generated method stub
	
		ServerSocket serversock = new ServerSocket(5555); //creating server socket
		Socket sock = serversock.accept(); //creating socket to capture input
		
		InputStreamReader IR = new InputStreamReader (sock.getInputStream()); //creating reader for input
		BufferedReader BR = new BufferedReader(IR); //creating buffered reader
		
		String input = BR.readLine(); //message to be read
		System.out.println(input); //output the message
		
		if(input != null){  //if input is not null
			PrintStream PS = new PrintStream(sock.getOutputStream());  //creating output stream
			PS.println("Received input"); //print out the result
		
		}
		
	}

}
