import java.sql.*;


public class StudentDb {

    public static void main(String [] args){

    try{
        // Register the Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the Database

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncit", "root", "");

        // create Statement

        Statement st = con.createStatement();

        String query = "SELECT * FROM students WHERE faculty = 'SE'";

        ResultSet rs = st.executeQuery(query);

        while(rs.next()){

            System.out.println("Roll Number:- " + rs.getInt(1)+ "\nName:- "+ rs.getString(2) + "\nFaculty:- " + rs.getString(3));

        }

        con.close();

    }catch(ClassNotFoundException e)
    {
        System.out.println(e.getMessage());
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    
}
}
