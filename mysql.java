import java.sql.*;
/* to connect with the Database we have to use the  java sql package */
public class mysql{
       public  static void main(String[]args) throws Exception {


           // step 1: load the driver class
           Class.forName("com.mysql.jdbc.Driver");
           // step 2: create the connection object
           Connection
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","Vaishnavi");
           // step 3: Create statement
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from studentsi");
           while(rs.next())
           {
               System.out.println(rs.getInt(1)+" \t| "+rs.getString(2)+" \t | "+rs.getString(3));
               //step 5: close the connection object

           }
           st.close();
           con.close();
       }

}