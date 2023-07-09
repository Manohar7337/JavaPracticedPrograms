
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class LoadingJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is loaded");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}