
import java.sql.*;
import java.util.Scanner;
class ConnectDbNext{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","len0v0@33214");
            PreparedStatement st = con.prepareStatement("INSERT INTO participants VALUES(?,?,?)");
           
            int count = 0;
            String choice;
            do{
                System.out.println("Enter ID:- ");
                int id = sc.nextInt();
                System.out.println("Enter name:- ");
                String name = sc.next();
                System.out.println("Enter Skill:- ");
                String skill = sc.next();

                st.setInt(1, id);
                st.setString(2, name);
                st.setString(3, skill);

                int rs = st.executeUpdate();

                count = count + rs;
                System.out.println("Press 'y' to continuer or 'n' to exit:- ");
                
            }while(!(choice = sc.next()).toLowerCase().startsWith("n"));
            System.out.println("Total insertion:- "+count);
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}