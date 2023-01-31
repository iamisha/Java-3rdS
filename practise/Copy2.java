
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class Copy2 {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("mfle.txt");
            FileOutputStream fos = new FileOutputStream("copied3.txt",true);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int data;
            while((data = bis.read()) != -1){
                bos.write(data);
                System.out.print((char)data);
            }
            bos.close();
            bis.close();
            fos.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}