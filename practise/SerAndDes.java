import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Student implements Serializable{
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void show(){
        System.out.println("Name:- "+this.name + "\nRoll:- "+this.roll);
    }
    public static void serialize(Student s)throws IOException{

        FileOutputStream fos = new FileOutputStream("myfle.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
    public static void deserialize()throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream("myfle.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student)ois.readObject();
        s.show();
        ois.close();
        fis.close();
    }
}
public class SerAndDes{
    public static void main(String [] args)throws IOException,ClassNotFoundException{
        Student s = new Student("Isha Hitang", 201710);
        Student.serialize(s);
        Student.deserialize();
       // s.show();
        
    }
}