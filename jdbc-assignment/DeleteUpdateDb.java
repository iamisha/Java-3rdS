import java.sql.*;
import java.util.Scanner;

public class DeleteUpdateDb {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncit", "root", "");

        //Delete records based on name
        System.out.println("Enter the name of the student you want to delete: ");
        String delName = sc.next();
        PreparedStatement st = conn.prepareStatement("DELETE FROM student WHERE Name = ?");
        st.setString(1, delName);
        int delCount = st.executeUpdate();
        if(delCount > 0)
            System.out.println(delCount + " records were deleted for the student: " + delName);
        else
            System.out.println("No records found for the student: " + delName);

        //Update a record
        System.out.println("Enter the Roll number of the student you want to update: ");
        int updRoll = sc.nextInt();
        System.out.println("Enter the new marks of the student : ");
        int updMarks = sc.nextInt();
        PreparedStatement pstUpd = conn.prepareStatement("UPDATE student SET Marks = ? WHERE Roll = ?");
        pstUpd.setInt(1, updMarks);
        pstUpd.setInt(2, updRoll);
        int updCount = pstUpd.executeUpdate();
        if(updCount > 0)
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Record Not Found");

        conn.close();
    }
}