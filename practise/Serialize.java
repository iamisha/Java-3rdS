import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int roll;
    String name;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void show(){
        System.out.println("Name :- "+this.name + "\nRoll :- "+this.roll);
    }
}
public class Serialize {
    public static void main(String [] args){
        try{
            Student s = new Student("Isha", 201710);
            FileOutputStream fos = new FileOutputStream("obj.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            s.show();
            oos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
