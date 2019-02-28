package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.Product;
import com.util.ConnectionManager;



public class ProductDAOImpl implements ProductDAO {
	
	ConnectionManager cm;
	Connection con;
	

	public ProductDAOImpl() {
		super();
		cm=new ConnectionManager();
		
	}

	@Override
	public int addProduct(Product p,InputStream inputStream) throws SQLException {
		// TODO Auto-generated method stub
		con=cm.connect();
		String sql="insert into product (name,category,description,price,photo)values(?,?,?,?,?)";
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		preparedStatement.setString(1, p.getName());
		preparedStatement.setString(2, p.getCategory());
		preparedStatement.setString(3, p.getDescription());
		preparedStatement.setFloat(4, p.getPrice());
		if (inputStream != null) {
            // fetches input stream of the upload file for the blob column
            preparedStatement.setBlob(5, inputStream);
        }
		int rs=preparedStatement.executeUpdate();
		if(rs==1){
			System.out.println("Product added successfully.");
		}
		else{
			System.out.println("Unable to add product.");
		}
		cm.disconnect();
		return rs;
	}

	@Override
	public List<Product> listAllProduct() throws SQLException {
		// TODO Auto-generated method stub
		List<Product> listProduct=listProduct=new ArrayList<>();
		String sql="select * from product";
		con=cm.connect();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		while (rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String category=rs.getString("category");
			String description=rs.getString("description");
			float price=rs.getFloat("price");
			Product p=new Product(name,id,category,description,price);
			listProduct.add(p);
		}
		cm.disconnect();
		return listProduct;
	}
	
	public int deleteProduct(Product p) throws SQLException {
		String sql="delete from product where id=?";
		con=cm.connect();
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		preparedStatement.setInt(1, p.getId());
		
		int rowInserted=preparedStatement.executeUpdate();
		preparedStatement.close();
		cm.disconnect();
		return rowInserted;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findAProduct(int id) throws SQLException {
		// TODO Auto-generated method stub
		Product p=null;
		String sql="Select * from product where id=?";
		con=cm.connect();
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet rs=statement.executeQuery();
		if(rs.next()){
			
			String name=rs.getString("name");
			String category=rs.getString("category");
			String description=rs.getString("description");
			float price=rs.getFloat("price");
			
			p=new Product(name,category,description,price);
			p.setId(id);
		}
		cm.disconnect();
		return p;
	}

	@Override
	public Product getProductDetails(int id) throws SQLException {
		// TODO Auto-generated method stub
		Product p=null;
		String sql="Select * from product where id=?";
		con=cm.connect();
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet rs=statement.executeQuery();
		if(rs.next()){
			
			String name=rs.getString("name");
			String category=rs.getString("category");
			String description=rs.getString("description");
			float price=rs.getFloat("price");
			byte[] image=rs.getBytes("photo");
			String encode = Base64.getEncoder().encodeToString(image);
					
			
			p=new Product(name,id,category,description,price,encode);
			p.setId(id);
		}
		cm.disconnect();
		return p;
	}

}
