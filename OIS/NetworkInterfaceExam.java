import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Collections;
import java.net.InetAddress;
import java.net.SocketException;;
public class NetworkInterfaceExam {

    public static void main(String[] args) {
        try{

            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            //loop
            for(NetworkInterface ifaces:Collections.list(interfaces)){
                System.out.println("Display Name:- "+ifaces.getDisplayName());
                System.out.println("Names:- "+ifaces.getName());
                System.out.println("*********************************");

                Enumeration<InetAddress>inet = ifaces.getInetAddresses();
                // loop
                for(InetAddress nets:Collections.list(inet)){
                    System.out.println("Addresses:- "+nets.getHostAddress());
                }
            }
        }catch(SocketException e){
            System.out.println(e.getMessage());
        }
    }
    
}
