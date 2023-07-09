
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingATableUsingJDBC {

	public static void main(String[] args) {
		String path = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pw = "system";
		Connection conn = null;
		Statement stmt = null;
		// step 4. creating a query
		String query = "create table car(brand varchar2(20),cost number)";
		// step 1. Loading a driver
		try {
			Class.forName(path);
			System.out.println("Driver is loaded");
			// step 2: establishing the connections
			conn = DriverManager.getConnection(url, un, pw);
			System.out.println("connections established");
			// step 3: creating the statement
			stmt = conn.createStatement();
			// step 5: executing the query
			stmt.executeUpdate(query);
			System.out.println("Querry has been executed");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

