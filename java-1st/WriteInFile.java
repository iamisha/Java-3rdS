import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fout = new FileOutputStream("myfile.txt", true);
        System.out.println("Enter a string\n");
        String str = sc.nextLine();
        byte[] b = str.getBytes();
        fout.write(b);
        fout.close();
    }
}
