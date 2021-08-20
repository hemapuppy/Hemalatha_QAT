import java.sql.*;


public class jdbctest {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "SYSTEM";
		String password = "abc";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connect = DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement s1 = connect.createStatement();
		String updateQuery = "UPDATE EMPLOYEE2 SET NAME = 'LUCKY' WHERE ID = 3";
		s1.executeUpdate(updateQuery);
		ResultSet result = s1.executeQuery("SELECT*FROM EMPLOYEE2");
		System.out.println("query execution" + result);
		
        while(result.next()){
			
			System.out.println(result.getString("ID") +":"+ result.getString("NAME"));
			
		}
		
			connect.close();

	}

}


		
