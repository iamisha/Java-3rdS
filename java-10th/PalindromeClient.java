import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
class PalindromeClient{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            Socket socket = new Socket("localhost",5000);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while(true){
                System.out.println("Enter any string to check if the string is palindrome or not:- ");
                String str = sc.nextLine();
                dos.writeUTF(str);

                if(str.equalsIgnoreCase("bye")){
                    break;
                }

                /* recieving from the server */
                String reply = dis.readUTF();
                System.out.println("Server replies:- "+reply);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}