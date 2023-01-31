import java.sql.*;
import java.util.Scanner;
public class ConnectDb {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name:- ");
            String name = sc.next();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","len0v0@33214");
            PreparedStatement st = con.prepareStatement("SELECT COUNT(name) from participants where name = ?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
            con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
