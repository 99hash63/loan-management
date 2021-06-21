package user;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

//	connecting to the databsae
	private static String url = "jdbc:mysql://localhost:3306/loan";
	private static String userName = "root";
	private static String password = "";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Error!");
		}
		
		return con;
	}
}
