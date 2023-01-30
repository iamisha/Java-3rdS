import java.io.IOException;
import java.net.InetAddress;

public class InetAddressExam {

    public static void main(String[] args) {
        try{

            InetAddress add = InetAddress.getByName("www.youtube.com");
            System.out.println("Host name:- "+add.getHostName());
            System.out.println("Host Address:- "+add.getHostAddress());
            System.out.println("********************************************");

            byte [] b = {127,0,0,1};
            InetAddress adds = InetAddress.getByAddress(b);
            System.out.println("Loop back address:- "+InetAddress.getLoopbackAddress());
            System.out.println("Is MultiCastAddress ?"+adds.isMulticastAddress());
            System.out.println("Is Global Multicast address?"+adds.isMCGlobal());
            System.out.println("********************************************");

            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host Name:- "+local.getHostName());
            System.out.println("Host Address:- "+local.getHostAddress());
            System.out.println("********************************************");

            InetAddress [] ipaddress = InetAddress.getAllByName("www.youtube.com");
            for(InetAddress address:ipaddress){
                System.out.println(address.getHostAddress());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
