/*
  FA18-BCS-002 / FA18-BCS-010
ABDUL HAMEED KHAN / DAUD AHMED
BCS 6A
 */
package server;

// Java program to illustrate Server Side Programming 
// for Simple Calculator using TCP 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.Scanner;


public class Server 
{ 
	public static void main(String args[]) throws IOException 
	{ 

		// Step 1: Establish the socket connection. 
		ServerSocket ss = new ServerSocket(4444); 
		Socket s = ss.accept(); 
                    Scanner sc = new Scanner(System.in); 
		// Step 2: Processing the request. 
		DataInputStream dis = new DataInputStream(s.getInputStream()); 
		DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 

		while (true) 
		{ 
			// wait for input 
                        	String input = dis.readUTF(); 
                          System.out.println(input);
			if(input.equals("bye")){ break;} 
                
                        String inp = sc.nextLine();
			// send the result back to the client. 
			dos.writeUTF(inp);
                        if(inp.equals("bye")){ break;} 
                        
		} 
	} 
} 
