package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class UserDBCon {

	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static String validate(String un, String pwd) {
		
		String name = "null";
		
		try {
			con = ConnectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where userName='"+un+"' and password='"+pwd+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				
				name = rs.getString(1);
				
			} else {
				name = "null";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return name;
	}
	
	
    public static boolean registerUser(String un, String pwd, String fn, String ln, String age, String cont, String e,String a ) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = ConnectDB.getConnection();
    		stmt = con.createStatement();
    	    String sql = "INSERT INTO user VALUES ('"+un+"', '"+pwd+"', '"+fn+"', '"+ln+"', '"+age+"', '"+cont+"', '"+e+"', '"+a+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e1) {
    		e1.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    
  public static List<User> getUser(String userName) {
		
   	 ArrayList<User> user = new ArrayList<>();
   		
   		try {
   			
   			con = ConnectDB.getConnection();
   			stmt = con.createStatement();
   			String sql = "select * from user where userName='"+userName+"'";
   			rs = stmt.executeQuery(sql);
   			
   			while (rs.next()) {
   				
   				String un = rs.getString(1);
   				String password = rs.getString(2);
   				String firstName = rs.getString(3);
   				String lastName = rs.getString(4);
   				String age = rs.getString(5);
   				String contact = rs.getString(6);
   				String email = rs.getString(7); 
   				String address = rs.getString(8);
   				
   				User u = new User(un, password, firstName, lastName, age, contact, email, address);
   				user.add(u);
   			}
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		
   		return user;	
   	}
       
   	

   	
   	
   	
    
	
}
