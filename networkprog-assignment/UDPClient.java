import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;
public class UDPClient {

    public static void main(String [] args){

        try{
            Scanner sc = new Scanner(System.in);
            /*DatagramSocket is the class that provides the connection-less point for sending and receiving packets */
            DatagramSocket client = new DatagramSocket();

            InetAddress add = InetAddress.getLocalHost();
            /*Assuming server is running at localhost */

            while(true){
                System.out.println("Enter a string you want to send to server:- ");
                String sendtoServer = sc.nextLine();
                if(sendtoServer.equalsIgnoreCase("bye")){
                    break;
                }

                /* creating the bytes of string that's  gonna send to server and initialing it by NULL */
                byte [] sendBuffer = null;
                sendBuffer = sendtoServer.getBytes();
                /* DatagramPacket is the class that is used to represent the packet of data sent or received over a datagram socket */
                DatagramPacket sendPacket =  new DatagramPacket(sendBuffer, sendBuffer.length, add, 5003);
                /* sends the packet to the server */
                client.send(sendPacket);

                /* receiving from the server */

                // giving the size of bytes that can be received
                byte [] rxBuffer = new byte[1024];
                DatagramPacket rxPacket = new DatagramPacket(rxBuffer, rxBuffer.length);
                // receives the packet from the server
                client.receive(rxPacket);

                String reply = new String(rxPacket.getData());
                System.out.print("Server replies:- "+reply + "\n");
            }
            client.close();
        }catch(java.io.IOException e){
            System.out.println();
        }
    }
    
}
