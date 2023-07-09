import java.sql.*;

import oracle.jdbc.OracleDriver;

public class ConnectionsJDBC {
	public static void main(String[] args) {
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pw = "system";
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver Loaded succesfully");
			DriverManager.getConnection(url, un, pw);
			System.out.println("connections established");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
