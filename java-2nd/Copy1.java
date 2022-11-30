import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Copy1 {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("mydesign.jpg");
            FileOutputStream fos = new FileOutputStream("copied.jpg");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}