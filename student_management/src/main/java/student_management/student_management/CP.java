package student_management.student_management;


import java.sql.*;

public class CP {
	static Connection con;
	
	public static Connection createc() {
		
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection
			String user = "root"; //user of mysql
			String password = "root"; //password of mysql
			String url = "jdbc:mysql://localhost:8889/manage";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	public int executeQuery(String query) throws ClassNotFoundException, SQLException {
		System.out.println(con.createStatement().executeUpdate(query));
        return con.createStatement().executeUpdate(query);
      }
	

	
}

