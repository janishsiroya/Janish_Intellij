package DB_Selenium;
import java.sql.*;
/**
 * Created by janish on 7/4/2017.
 */
public class SQLConnector {
    public static void  main(String[] args) throws  ClassNotFoundException, SQLException {
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/sys";
        //Database Username
        String username = "root";
        //Database Password
        String password = "janish1";
        //Query to Execute
        String query = "select * from login where Userid = 1;";
        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            Integer Userid=rs.getInt(1);
            String Username = rs.getString(2);
            System. out.println(Userid+"  "+Username);
        }
        // closing DB Connection
        con.close();
    }
}
