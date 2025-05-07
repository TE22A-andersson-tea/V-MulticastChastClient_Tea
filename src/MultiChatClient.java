import java.io.BufferedReader;
import java.io.*;
import java.net.*;

public class MultiChatClient{
    public static void main(String[] args) throws Exception {
    
    //Default port number we are going to use
    int portnumber = 5000;
    if (args.length >=1) {
        portnumber = Integer.parseInt(args[0]);
    }

    // Create a Multitastsocket 
    MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
    
    //Determine the IP address of a host, given the host name
    InetAddress group = InetAddress.getByName("225.4.5.6");

    //Join multicast group 
    chatMulticastSocket.joinGroup(group);

    //Promt a user to enter a message
    String msg = "";
    System.out.println("Type a message for the server: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    msg = br.readLine();

    //Send the message to Multicast address
    DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
    chatMulticastSocket.send(data);

    //Close the socket
    chatMulticastSocket.close();
    
    }
}