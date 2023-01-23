
import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;
public class MultiThreadClient {

    public static void main(String[] args) {
        
        try{

            Socket socket = new Socket("localhost", 5001);
            Scanner sc = new Scanner(System.in);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while(true){
                System.out.println("Enter any text to send in server:- ");
                String txt = sc.nextLine();
                if(txt.equalsIgnoreCase("exit")){
                    System.out.println("Session is terminated");
                    break;
                }else{
                    dos.writeUTF(txt);
                    String rdserver = dis.readUTF();
                    System.out.println("Server sends:- "+rdserver);
                }
                
            }
            dis.close();
            dos.close();
            sc.close();
            socket.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
