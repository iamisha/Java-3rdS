import java.net.InetAddress;


public class InetAddressExam{
    public static void main(String [] args){

        try{

            // It returns the localhost IP and Name.
            InetAddress add = InetAddress.getByName("www.youtube.com");
            System.out.println("Host Name:- "+add.getHostName());
            System.out.println("Host Address:- "+add.getHostAddress());

            System.out.println("****************************************************");


            // Returns the InetAddresses of host with specified IP Addresses
            byte [] b = {(byte) 142,(byte) 250,(byte) 182,(byte) 238};
            InetAddress adds = InetAddress.getByAddress(b);
            System.out.println("InetAddresses of host with specified IP Addresses are:- "+adds);
            System.out.println("Is loopback address ?"+adds.isLoopbackAddress());
             /* 
             We use isloopbackAddress() method to check if our NIC(Netwrok Interface Card is working or not)
             */
            System.out.println("Loopback Address:- "+InetAddress.getLoopbackAddress());
            System.out.println("Is multicastAddress ?"+adds.isMulticastAddress());
            System.out.println("Is global multi cast address ?"+add.isMCGlobal());

            // To check the addresses of the localhost
            System.out.println("******************************************************");
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host Name:- "+local.getHostName());
            System.out.println("Host Address:- "+local.getHostAddress());

            System.out.println("******************************************************");

            /* Returns all the IP Addresses associated  with the given URL */
            System.out.println("IP Addressess associted with the URL are:- ");
            InetAddress [] ipaddress = InetAddress.getAllByName("www.youtube.com");

            // Loop 
            for(InetAddress address : ipaddress){
                System.out.println(address.getHostAddress());
            }



        }catch(java.net.UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
}