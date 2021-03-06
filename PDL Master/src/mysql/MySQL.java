package mysql;

import java.sql.*;
import com.mysql.jdbc.Connection;

public class MySQL {

	private Connection cnx;
	private static MySQL db;
	
	private MySQL(){
		String url= "jdbc:mysql://109.8.192.56:3306/";
        String dbName = "pdlchess";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "pdlchess";
        String password = "miage2015";
        try {
            Class.forName(driver).newInstance();
            this.cnx = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception e) { e.printStackTrace(); }
	}
	
	public static synchronized MySQL getInstance(){
		if(db == null){
			db = new MySQL();
		}
		return db;
	}
	
	public ResultSet query(String query) throws SQLException{
		Statement st = db.cnx.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		return rs;
	}
	
}
