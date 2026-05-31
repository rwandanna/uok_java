import java.sql.*;

public class JDBC_DeleteExample {
    public static void main(String[] args) {
        // JDBC connection parameters — adjust URL/user/password for your DB
        String url = "jdbc:mysql://localhost:3306/companyDB";
        String user = "root";
        String pass = "password";
        try {
            // 1. Load the JDBC driver (required for older Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish a connection to the database
            Connection conn = DriverManager.getConnection(url, user, pass);
            // 3. Create a Statement object to send SQL commands
            Statement stmt = conn.createStatement();
            // SQL delete command — delete employee whose firstname is 'Alice'
            String strSQL = "DELETE FROM employs WHERE fistname = 'Alice'";
            // 4. Execute the DELETE statement; returns number of rows affected
            int rowsEffected = stmt.executeUpdate(strSQL);
            // 5. Display how many rows were deleted
            System.out.println(rowsEffected + " rows effected");
            // 6. Close resources
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}

public class JDBC_UpdateExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companyDB";
        String user = "root";
        String pass = "password";
        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish database connection
            Connection conn = DriverManager.getConnection(url, user, pass);
            // 3. Create statement
            Statement stmt = conn.createStatement();
            // SQL update command — change location to Kigali for ID = 1
            String strSQL = "UPDATE employs SET location = 'Kigali' " +
                    "WHERE Identification = '1'";
            // 4. Execute UPDATE; returns number of rows changed
            int rowsEffected = stmt.executeUpdate(strSQL);
            // 5. Print result
            System.out.println(rowsEffected + " rows effected");
            // 6. Close resources
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}