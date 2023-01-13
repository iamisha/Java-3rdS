import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException{

        try{
            
            Socket socket = new Socket("localhost", 5667);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner sc = new Scanner(System.in);
            String msgnext;
            while(true){
                System.out.println("Enter a  string  to  check :- ");
                msgnext = sc.nextLine();
                pw.println(msgnext);
                System.out.println(br.readLine());
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
