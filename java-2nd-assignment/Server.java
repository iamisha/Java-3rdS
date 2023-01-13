//importing all the packages
import java.net.*;
import java.io.*;


class Server{
    public static void main(String[] args) {
        try{
            
            ServerSocket ss = new ServerSocket(5667);
            Socket socket = ss.accept();

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String  msg;
            while((msg = br.readLine()) != null){
                if(isPalindrome(msg)){
                    pw.println("palindrome");
                }else{
                    pw.println("not palindrome");
                }
            }
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static  boolean isPalindrome(String str){
        int  i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    
    return true;
}
}