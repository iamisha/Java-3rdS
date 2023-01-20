
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
class ClientHandler extends Thread{
     Socket socket;

    // constructor
    public ClientHandler(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try{
            System.out.println("client accepted in port no "+ socket.getPort());
            DataInputStream dis = new DataInputStream(this.socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(this.socket.getOutputStream());
            while(true){
                String txt = dis.readUTF();
                System.out.println("client says:- "+txt);
               
                String reply = "ohh okay, i'm server";
                dos.writeUTF(reply);
            }
        }catch(java.io.IOException e){
            System.out.print(e.getMessage());
        }
    }
}
public class MultiThreadTCP {
    public static void main(String [] args){
        try{

            ServerSocket ss = new ServerSocket(5001);
            System.out.println("Server running at 5001");
        
            while(true){
                Socket socket = ss.accept();
                ClientHandler thread = new ClientHandler(socket);
                thread.start();
            }
        }catch(java.io.IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
