import java.net.DatagramSocket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPServer {

    public static void main(String [] args){
        try{
                DatagramSocket server = new DatagramSocket(5003);
                while(true){
                    byte [] rxBuffer = new byte[1024];
                    DatagramPacket rxPacket = new DatagramPacket(rxBuffer, rxBuffer.length);
                    server.receive(rxPacket);

                    String msg = new String(rxPacket.getData());
                    System.out.println("Client says:- "+msg);

                    // gets the address of the client
                    InetAddress clientadd = rxPacket.getAddress();

                    // gets the port of the client
                    int port = rxPacket.getPort();
                    System.out.println("Client adddress:- "+clientadd + " : " + "Client running at port:- "+port);


                    /* sending the data back to client */
                    byte [] sendBuffer = null;
                    String serverSends = "Oh, hello, i'm Server";
                    // converting the messager received from client to the bytes

                    sendBuffer = serverSends.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientadd, port);
                    server.send(sendPacket);
                
                }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
