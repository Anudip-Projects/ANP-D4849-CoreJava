package com.anudip.model;

public class Product {

	private int productId;
	private String productName;
	private double prize;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	//setter and getter method
	//param construc
	//toString
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public Product(int productId, String productName, double prize) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", prize=" + prize + "]";
	}
	
	
}
