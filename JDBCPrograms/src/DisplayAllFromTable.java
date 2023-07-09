import java.sql.*;

import oracle.jdbc.OracleDriver;
public class DisplayAllFromTable {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		String pw="system";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		//step 4: creating the query
		String query="select * from emp";
		//step1: loading the driver
		try {
			DriverManager.registerDriver(new OracleDriver());
			//step2: establishing the connections
			con=DriverManager.getConnection(url,un,pw);
			//step3: creating the statements
			stmt=con.createStatement();
			//step5: executing the query
			rs=stmt.executeQuery(query);
			while(rs.next()==true) {
				int id=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				String email=rs.getString(4);
				int phone=rs.getInt(5);
				System.out.println(id+" "+fname+" "+lname+" "+email+" "+phone);
			
			}
			System.out.println("Query has been successfully executed");
			//step6: closing the resources or cleanup code
			con.close();
			stmt.close();
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
