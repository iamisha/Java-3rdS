package practise;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy1 {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("mfle.txt");
            FileOutputStream fos = new FileOutputStream("copied.txt",true);
            int data;
            while((data = fis.read()) != -1){
                fos.write((char)data);
                System.out.print((char)data);
            }
            fos.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
