import java.sql.*;
/* to connect with the Database we have to use the  java sql package */
public class mysqlin{
    public  static void main(String[]args) throws Exception {


        // step 1: load the driver class
        Class.forName("com.mysql.jdbc.Driver");
        // step 2: create the connection object
        Connection
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","Vaishnavi");
        // step 3: Create statement
        Statement st = con.createStatement();

        int rs= st.executeUpdate("insert into ddl(id,college_name,branch) values(5,'SRM ','Chennai');");
        System.out.println( rs+" row/s affected");
        st.close();
        con.close();
    }

}