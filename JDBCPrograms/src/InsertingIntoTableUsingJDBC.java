import java.sql.*;

public class InsertingIntoTableUsingJDBC {

	public static void main(String[] args) {
		String path = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pw = "system";
		Connection conn = null;
		Statement stmt = null;
		// Step 4. insert into table
		String query = "insert into car values('Audi', 200000)";
		try {
			// step 1. Loading the driver
			Class.forName(path);
			System.out.println(" Driver is loaded succesfully");
			// step2. Establishing the connections
			conn = DriverManager.getConnection(url, un, pw);
			System.out.println("Connections are established successfully");
			// step 3. Creating a Statement
			stmt = conn.createStatement();
			// step 5. executing the querry
			stmt.executeUpdate(query);
			System.out.println("query is executed successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
