import java.sql.*;



public class MYSQL1 {
    public static void main(String[] args) {\
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/v2w", "root", "12345@ARUNasalam");
            System.out.println("hello");
            Statement obj2 = obj.createStatement();


            ResultSet obj3 = obj2.executeQuery("select * from employeeinfo");

      while (obj3.next()){
          System.out.println(obj3.getString(1) + " " + obj3.getString(2));
      }
            obj3.close();
            ResultSet obj4 = obj2.executeQuery("select * from employeePackage");
      while (obj4.next()){
          System.out.println(obj4.getString(1) + " " + obj4.getString(2));
      }
            obj4.close();
      obj.close();

        }catch (Exception e){
            System.out.println(e);

        } }
    }

