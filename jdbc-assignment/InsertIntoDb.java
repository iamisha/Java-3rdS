import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Scanner;

public class InsertIntoDb {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncit", "root", "");
        PreparedStatement pst = conn.prepareStatement("INSERT INTO student VALUES(?, ?, ?, ?)");
        String prompt;
        do{
            System.out.println("Enter Roll number : ");
            int enRoll = sc.nextInt();
            System.out.println("Enter  Name : ");
            String enName = sc.next();
            System.out.println("Enter Faculty : ");
            String enFaculty = sc.next();
            System.out.println("Enter  Marks : ");
            int enMarks = sc.nextInt();
            pst.setInt(1, enRoll);
            pst.setString(2, enName);
            pst.setString(3, enFaculty);
            pst.setInt(4, enMarks);
            pst.executeUpdate();
            System.out.println("enter any key to continue or 'exit' to end the program...");
            prompt = (sc.next()).toLowerCase();
        }while(!prompt.equals("exit"));
        conn.close();
    }
}