import java.sql.*;
/* to connect with the Database we have to use the  java sql package */
public class oracle {
    public static void main(String[]args)
    {
        try{
            // step 1: load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // step 2: create the connection object
            Connection
                    con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","Vaishnavi");
            //step 3: Create the statement object
            Statement stmt=con.createStatement();
            // step 4: Execute a query
            ResultSet rs = stmt.executeQuery("select * from employee");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                //step 5: close the connection object
                con.close();

            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}