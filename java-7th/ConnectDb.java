import java.sql.*;// importing the sql package

class ConnectDb{
    public static void main(String [] args){
        try{
            // register the Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon", "root", "");

            // create Statement
            Statement st = con.createStatement();

            // Query

            String query = "SELECT * FROM participants";

            // executing the query

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("ID:- "+ rs.getInt(1) + "\nName:- " + rs.getString(2)+"\nSkills:- " + rs.getString(3));
                
            }

            con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}