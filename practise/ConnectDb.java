
import java.sql.*;

public class ConnectDb {

    public static void main(String[] args) {
        try{
            //1.  register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ncit","root","len0v0@33214");

            // 3. create statement
            Statement st = con.createStatement();

            // 4. Query 
            String query = "SELECT * FROM student";

            // 5. executing the query
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("Roll no:- "+rs.getInt(1)+"\nName:- "+rs.getString(2)+"\nFaculty:- "+rs.getString(3));

            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}
