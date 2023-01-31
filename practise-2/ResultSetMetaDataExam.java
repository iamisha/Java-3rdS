import java.sql.*;

public class ResultSetMetaDataExam {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","len0v0@33214");
            Statement st = con.createStatement();
            String query = "SELECT * FROM participants";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            System.out.println("No of columns:- "+meta.getColumnCount());
            System.out.println("Name of the table:- "+meta.getTableName(1));
            System.out.println("Name of the column:- "+meta.getColumnName(3));
            System.out.println("Column type:- "+meta.getColumnType(3));
            System.out.println("Column Type name:- "+meta.getColumnTypeName(2));
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
