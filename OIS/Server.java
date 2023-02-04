import java.net.*;
import java.io.*;

class Server{
    public static void main(String[] args) {
        
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is running at 5000");

            Socket socket = ss.accept();
            System.out.println("Client is accepted at port"+socket.getPort());

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while(true){
                
                int val = dis.readInt();
                System.out.println("Client sends:- "+val);

                int res = val * val;
                dos.writeInt(res); 
            }
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}