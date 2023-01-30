import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class PalindromeServer{
    public static void main(String [] args){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is running at 5000");

            Socket socket = ss.accept();
            System.out.println("Client accepted at port "+socket.getPort());

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while(true){

                String client_sends = dis.readUTF();
                String rev = "";
                System.out.println("Client says:- "+client_sends);
                for(int i=client_sends.length()-1;i>=0;i--){

                    rev = rev + client_sends.charAt(i);
                }
                System.out.println("Reverse of the string is "+rev);

                if(rev.equalsIgnoreCase(client_sends)){
                    dos.writeUTF("PALINDROME");
                }else{
                    dos.writeUTF("NOT A PALINDROME");
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}