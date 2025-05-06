import java.net.MulticastSocket;

public class MultiChatClient{
    public static void main(String[] args) throws Exception {
    
    //Default port number we are going to use
    int portnumber = 5000;
    if (args.length >=1) {
        portnumber = Integer.parseInt(args[0]);
    }

    // Create a Multitastsocket 
    MulticastSocket serverMulticastSocket = new MulticastSocket(portnumber);
    
    //Determine the IP address of a host 

    
    }
}