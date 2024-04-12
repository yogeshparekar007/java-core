package com.PS5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> items = new ArrayList<Product>();
	public void addItem(Product item) {
		items.add(item);
	}
	public List<Product> getItems() {
		return items;
	}
	public void setItems(List<Product> items) {
		this.items = items;
	}
}
