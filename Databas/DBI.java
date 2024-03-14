import java.io.*;
import java.sql.*;
import java.util.*;

class DBI {
    public static void main(String args[]) {
        Connection con;
        Statement st;
        ResultSet rs;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter User Name :");
            String username = s.nextLine();
            System.out.println("Enter Password");
            String password = s.nextLine();
            
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // Establish connection with Oracle database
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "sarath");
            
            // Create statement object
            st = con.createStatement();
            
            // Execute SQL query
            String str = "select * from login where username='" + username + "' and password='" + password + "'";
            rs = st.executeQuery(str);
            
            // Process the result
            if (rs.next()) {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
            
            // Close resources
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally {
            // Close scanner
            s.close();
        }
    }
}
