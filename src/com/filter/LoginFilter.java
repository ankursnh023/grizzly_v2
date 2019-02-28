package com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAOImpl;
import com.model.Login;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/ProductController")
public class LoginFilter implements Filter {

	LoginDAOImpl loginDAOImpl;
	int count=0;
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    	loginDAOImpl = new LoginDAOImpl();
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
//		chain.doFilter(request, response);
		
		HttpServletRequest httpServlet=(HttpServletRequest) request;
		HttpSession httpSession=httpServlet.getSession();
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		try {
			boolean flag=loginDAOImpl.validateUser(uname, pass);
			if(flag){
				System.out.println("Valid user");
				chain.doFilter(request, response);
			}
			else{
//				RequestDispatcher rd=request.getRequestDispatcher("faliure.jsp");
				System.out.println("Invalid credentials");
//				chain.doFilter(request, response);
				if(count<3){
					count++;
					pw.write("invalid credentials \t "+(3-count)+" attempts left!");
					System.out.println("invalid credentials \t "+(3-count)+" attempts left!");
					request.getRequestDispatcher("/").forward(request, response);
				}
				else{
					Login l=new Login();
					l.setStatus(1);
					pw.write("Account locked");
					httpSession.invalidate();
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
