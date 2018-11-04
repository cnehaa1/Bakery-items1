package com.hexad.Bakery;

public class Product {

	private String productName;
	private int noOfProduct;

	public int getNoOfProduct() {
		return noOfProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setNoOfProduct(int noOfProduct) {
		this.noOfProduct = noOfProduct;
	}

	public Product(String productName, int noOfProduct) {

		this.productName = productName;
		this.noOfProduct = noOfProduct;
	}

}
