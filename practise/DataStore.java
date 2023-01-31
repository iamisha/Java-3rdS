import java.io.*;
import java.util.*;

class DataStore{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("record.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            String choice;
            do{
                System.out.println("Enter name:- ");
                String name = sc.next();
                System.out.println("Enter roll:- ");
                int roll = sc.nextInt();
                System.out.println("Enter the faculty:- ");
                String fac = sc.next();
                System.out.println("Enter the address:- ");
                String add = sc.next();

                dos.writeUTF(name);
                dos.writeInt(roll);
                dos.writeUTF(fac);
                dos.writeUTF(add);

                System.out.println("press any key to continue or 'n' to exit:- ");
            }while(!(choice = sc.next()).toLowerCase().startsWith("n"));

            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}