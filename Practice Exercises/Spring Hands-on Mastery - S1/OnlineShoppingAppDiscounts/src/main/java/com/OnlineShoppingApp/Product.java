package com.OnlineShoppingApp;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private double discount;

	public Product(int productId, String productName, double price, double discount) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.discount = discount;
	}

	// Getters and setters
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", discount="
				+ discount + "]";
	}
}
