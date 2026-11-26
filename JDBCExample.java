import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCExample {

    public static void main(String[] args) {

        try {

            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Database Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "1234"
            );

            System.out.println("Database connected successfully!");

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute SQL Query
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM student"
            );

            // Step 5: Display Records
            System.out.println("\nStudent Details:");

            while (rs.next()) {

                System.out.println("ID: " +
                    rs.getInt("id"));

                System.out.println("Name: " +
                    rs.getString("name"));

                System.out.println("Department: " +
                    rs.getString("department"));

                System.out.println("Age: " +
                    rs.getInt("age"));

                System.out.println("-------------------");
            }

            // Step 6: Close Connection
            rs.close();
            stmt.close();
            con.close();

        }

        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
