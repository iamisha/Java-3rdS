import java.io.*;

class DataRead{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("record.dat");
            DataInputStream dis = new DataInputStream(fis);
            while(dis.available()>0){
                String name = dis.readUTF();
                int roll = dis.readInt();
                String fac = dis.readUTF();
                String add = dis.readUTF();

                if(fac.toLowerCase().equals("software")){
                    System.out.println("Name:- "+name+"\nRoll:- "+roll+"\nFaculty:- "+fac + "\nAddress:- "+add);
                }
            }
            dis.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}