package com.model;

public class Product {
	
	String name;
	int id;
	String description;
	String category;
	float price;
	String image;
	
	
	
	public Product() {
		super();
	}



	public Product(String name,String category,String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}



	public Product(String name, int id,String category,String description, float price) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.category = category;
		this.price = price;
	}
	
	

	

	public Product(String name, int id, String description, String category, float price, String image) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.category = category;
		this.price = price;
		this.image = image;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", description=" + description + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	

}
