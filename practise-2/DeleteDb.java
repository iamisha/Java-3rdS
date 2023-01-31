import java.sql.*;

class DeleteDb{
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","len0v0@33214");
            PreparedStatement st = con.prepareStatement("DELETE FROM participants WHERE name = ?");
            st.setString(1, "Ishan");

            int rs = st.executeUpdate();
            System.out.println("Data deleted successfully...");
            con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}