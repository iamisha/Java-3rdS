import java.sql.*;
import java.util.Scanner;

class AllInOne{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","");
            AllInOne db = new AllInOne();
            System.out.println("**********MENU**********");
            System.out.println("1. Show all the data of the table...");
            System.out.println("2. Insert data into the table...");
            System.out.println("3. update data of the tabale...");
            System.out.println("4. Delete data from the table...");
            System.out.println("5. Count total number of the data...");
            System.out.println("6. Total count by specified name...");
            int choice;
            while(true){
                System.out.println("Enter choice:- ");
                choice = sc.nextInt();

                switch(choice){
                    case 1:
                        db.showRecords(con);
                        break;
                    case 2:
                        db.insertData(con);
                        break;
                    case 3:
                        db.updateData(con);
                        break;
                    case 4:
                        db.deleteData(con);
                        break;
                    case 5:
                        db.coundTotalData(con);
                        break;
                    case 6:
                        db.coundByName(con);
                        break;
                    default:
                        System.out.println("wrong choice...");
                }

            }            
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void showRecords(Connection con)throws SQLException{
        Statement st = con.createStatement();
        String query = "SELECT * FROM participants";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println("ID:- "+rs.getInt(1)+"\nName:- "+rs.getString(2)+"\nSkills:- "+rs.getString(3));
        }
    }
    public void insertData(Connection con)throws SQLException{
    
        Statement st = con.createStatement();
        String query = "INSERT into participants VALUES(133,'Mohan','nothing')";
        int rs = st.executeUpdate(query);
        System.out.println("Updation successfull...");
    }
    public void updateData(Connection con)throws SQLException{
        Statement st = con.createStatement();
        String query = "UPDATE participants SET Name = 'Honey', ID = 133 WHERE Name = 'Babin'";
        int rs = st.executeUpdate(query);
        System.out.println("Information udpdated successfully...");
    }
    public void deleteData(Connection con) throws SQLException {
        System.out.println("Enter the name you want to delete");
        String del = sc.next();
        PreparedStatement st = con.prepareStatement("DELETE FROM participants WHERE name = ?");
        st.setString(1,del);
        int rs = st.executeUpdate();
        System.out.println("data deleted successfully...");
    }
    public void coundTotalData(Connection con) throws SQLException {
        Statement st = con.createStatement();
        String query = "SELECT COUNT(ID) FROM participants";
        ResultSet rs = st.executeQuery(query);
        rs.next();
            System.out.println("Total count:- "+rs.getInt(1));
        
    }
    public void coundByName(Connection con) throws SQLException{
        System.out.println("Enter the name:- ");
        String name = sc.next();
        PreparedStatement st = con.prepareStatement("SELECT COUNT(ID) FROM participants WHERE name = ?");
        st.setString(1, name);
        ResultSet rs = st.executeQuery();
        rs.next();
        System.out.println("Total count of name "+name+" is "+rs.getInt(1));
    }
}