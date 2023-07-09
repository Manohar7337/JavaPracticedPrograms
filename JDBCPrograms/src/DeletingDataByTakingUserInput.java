import java.util.*;

import oracle.jdbc.OracleDriver;

import java.sql.*;
public class DeletingDataByTakingUserInput {

	public static void main(String[] args) {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		String pw="system";
		Connection con=null;
		PreparedStatement pstmt=null;
		//step 4: create query
		String query="delete from Car where brand=?";
		//step 1: loading the driver
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is loaded");
		//step 2: creating connections
			con=DriverManager.getConnection(url,un,pw);
			System.out.println("Connections are established");
			Scanner scan=new Scanner(System.in);
			System.out.println("enter brand to delete");
			String brand=scan.nextLine();
		//step 3: creating statements
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, brand);
			System.out.println("Statements are created");
		//step 5: executing the query
			pstmt.executeUpdate();
			System.out.println("query has been executed successfully");
		//step 6: closing the costly resources or cleanup code
			con.close();
			pstmt.close();
			scan.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
