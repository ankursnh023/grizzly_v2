package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDAOImpl;

/**
 * Servlet implementation class GrizzlyController
 */
//@WebServlet("/GrizzlyController")
public class GrizzlyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDAOImpl ld;
    /**
     * Default constructor. 
     */
    public GrizzlyController() {
        // TODO Auto-generated constructor stub
    	
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	ld=new LoginDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getServletPath();
		switch (action) {
		case "/": 
				ld.showLoginForm(request,response);
				System.out.println("/ called");
				break;
				
		case "/logout": System.out.println("/logout");
		request.getSession().invalidate();
		request.getRequestDispatcher("/").forward(request, response);
		break;
				
//		case "/home": 
//				System.out.println("/home called");
//				break;
		default : break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
