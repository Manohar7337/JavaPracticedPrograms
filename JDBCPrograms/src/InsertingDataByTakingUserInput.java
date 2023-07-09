import java.sql.*;
import java.util.Scanner;
public class InsertingDataByTakingUserInput {

	public static void main(String[] args) {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		Connection con=null;
		PreparedStatement pstmt=null;
		
		//step 4: Creating a query
		String query="insert into Car values(?,?)";
		//step 1: loading the driver from hdd to ram
		try {
			Class.forName(path);
			System.out.println("driver is loaded");
		//step 2: establishing the connections
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("connections  established");
			Scanner scan=new Scanner(System.in);
			System.out.println("enter brand");
			String brand=scan.nextLine();
			System.out.println("enter cose");
			int cost=scan.nextInt();
		//step 3: creating the statements
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, brand);//1st position brand
			pstmt.setInt(2, cost);//2nd position cost
			//step 5: executing the query
			pstmt.executeUpdate();
			//step6: closing code
			scan.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
