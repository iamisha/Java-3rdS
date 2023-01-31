import java.sql.*;

class ConnectDbNext{
    public static void main(String[] args) {
        try{
            // 1. register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. connect to the database
            Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/ncit","root","");
            // 3. create statement
            Statement st = con.createStatement();
            // query
            String query = "SELECT * FROM student WHERE faculty = 'SE'";
            // 4. Execute query
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("Name:- "+rs.getString(2)+"\nRoll:- "+rs.getInt(1)+"\nFaculty:- "+rs.getString(3));
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}