package com.dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import com.model.Product;


public interface ProductDAO {
	
	
	public int deleteProduct(Product p) throws SQLException;
	public int addProduct(Product p,InputStream inputStream) throws SQLException;
	public List<Product> listAllProduct() throws SQLException;
	public Product findAProduct(int id) throws SQLException;
	public Product getProductDetails(int id) throws SQLException;
}
