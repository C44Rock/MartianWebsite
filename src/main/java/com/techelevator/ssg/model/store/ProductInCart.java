package com.techelevator.ssg.model.store;

public class ProductInCart {
	
	private Product product;
	private int quantity;

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public DollarAmount getTotalPrice() {
		return product.getPrice().multiply(quantity);
	}

}
