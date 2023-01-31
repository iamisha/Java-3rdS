import java.sql.*;

public class DatabaseMetaDataExam {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","len0v0@33214");
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("Driver name:- "+meta.getDriverName());
            System.out.println("Driver version:- "+meta.getDriverVersion());
            System.out.println("User name:- "+meta.getUserName());
            System.out.println("Database product:- "+meta.getDatabaseProductName());
            System.out.println("Database product version:- "+meta.getDatabaseProductVersion());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
