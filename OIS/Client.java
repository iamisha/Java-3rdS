import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            Socket socket = new Socket("localhost",5000);
            
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while(true){

                /* sending to the server *   ter an integer:- ");
                int intger = sc.nextInt();
                dos.writeInt(intger);

                /* recieving from the server */
                int square = dis.readInt();
                System.out.println("Server replies:- "+square);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
