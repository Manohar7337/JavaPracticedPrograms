import java.sql.*;
public class InsertingIntoTable2 {

	public static void main(String[] args)  {
		String path = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";//1521
		String un = "system";
		String pw = "system";
		Connection con=null;
		Statement stmt=null;
		//Step 4: Creating a query
		String query = "create table car(brand varchar2(20), cost number)";
		try 
		{
		//Step 1: Loading the Driver
		Class.forName(path);
		System.out.println("Driver is loaded successfully");
		//Step 2: Establishing the connection
		 con = DriverManager.getConnection(url, un, pw);
		System.out.println("Connection is established successfully");
		//Step 3: Creating a statement
		 stmt = con.createStatement();
		//Step 5: Executing the query
		stmt.executeUpdate(query);
		System.out.println("Query has been executed");
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}

	}

}
