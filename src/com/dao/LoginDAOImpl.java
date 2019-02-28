package com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionManager;

public class LoginDAOImpl implements LoginDAO{
	
	ConnectionManager cm;
	
	
	public LoginDAOImpl() {
		super();
		cm=new ConnectionManager();
	}

	@Override
	public boolean validateUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		boolean status;
		Connection con=cm.connect();
		String sql="select usersname,password from users where usersname=? and password=?";
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet rs=preparedStatement.executeQuery();
		if(rs.next())
			status=true;
		else
			status=false;
		
		return status;
		
		
	}

	@Override
	public void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}
