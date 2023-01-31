
import java.sql.*;

class UpdateDb{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hackathon","root","len0v0@33214");
            Statement st = con.createStatement();
            String query = "UPDATE participants SET ID=100, Name='Ishan',Skills = 'AItop' WHERE Name = 'Isha'";
            int rs = st.executeUpdate(query);
            System.out.println("data updated successfully...");
            con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}