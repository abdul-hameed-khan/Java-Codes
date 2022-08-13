/*
  FA18-BCS-002 / FA18-BCS-010
ABDUL HAMEED KHAN / DAUD AHMED
BCS 6A
 */

package client;

// Java program to illustrate Client Side Programming 
// for Simple Calculator using TCP 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.InetAddress; 
import java.net.Socket; 

import java.util.Scanner; 

public class Client 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		InetAddress ip = InetAddress.getLocalHost(); 
		int port = 4444; 
		Scanner sc = new Scanner(System.in); 

		// Step 1: Open the socket connection. 
		Socket s = new Socket(ip, port); 

		// Step 2: Communication-get the input and output stream 
		DataInputStream dis = new DataInputStream(s.getInputStream()); 
		DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
                 System.out.println( " start your chatting");
		while (true) 
		{ 
		String inp = sc.nextLine();
                    dos.writeUTF(inp);
                    if (inp.equals("bye")){ break;}
			// wait till request is processed and sent back to client 
			String ans = dis.readUTF(); 
			System.out.println( ans); 
                        if(ans.equals("bye")){ break;} 
	           
	} 
} 
}

