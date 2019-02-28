package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	final String url="jdbc:mysql://localhost:3306/grizzlystore?useSSL=false";
	final String username="root";
	final String password="root";
	final String driver="com.mysql.jdbc.Driver";
	
	Connection con;
	
	
	public Connection connect() throws SQLException {
		// TODO Auto-generated method stub
		if(con==null || con.isClosed()){
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con= DriverManager.getConnection(url,username,password);
			System.out.println(con);
		}
		return con;
	}
	
	public void disconnect() throws SQLException {
		// TODO Auto-generated method stub
		if(con!=null && !con.isClosed()){
			con.close();
		}
		
	}

}
