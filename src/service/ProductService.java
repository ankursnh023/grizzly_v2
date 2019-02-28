package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ProductService {
	
	public void showAllProducts(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException;

	public void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException;

	public void addNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	public void insertNewProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException;

	public void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException;
}
