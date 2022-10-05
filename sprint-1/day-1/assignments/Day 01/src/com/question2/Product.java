package com.question2;

public class Product implements Comparable<Product>{
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return o.productPrice > this.productPrice ? 1 : -1;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}



	private int productId;
	private String productName;
	private int productPrice;
	
	Product()
	{
		
	}

	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	
	
	

}
