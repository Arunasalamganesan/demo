import java.sql.*;

public class MYSQL6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/v2w", "root", "1345@ARUNasalam");
            Statement obj2 = obj.createStatement();

            obj2.executeUpdate("create table demotable(number int,name varchar(20),address varchar(50))");
            int y = obj2.executeUpdate("drop table demotable" );
            ResultSet rs = obj2.executeQuery("select * from demotable");
            while(rs.next()){
              System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " +rs.getString(3)+rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
