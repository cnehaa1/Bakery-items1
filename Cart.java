package com.hexad.Bakery;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> items = new ArrayList<Product>();

	public void add(Product product) {

		if (product.getNoOfProduct() < 0) {
			throw new IllegalArgumentException("Cannot add a product with count less than zero");
		}
		items.add(product);

	}

	public int size() {

		return items.size();
	}

	public BigDecimal total() {

		BigDecimal totalPrice = new BigDecimal("0.00");

		for (Product product : items) {

			if (product instanceof VS5) {
				if (product.getNoOfProduct() < 3 || product.getNoOfProduct() ==4) {
					throw new IllegalArgumentException("Cannot add a product with count less than three or equal to 4");
				}
				
				totalPrice = totalPrice.add(VS5.total(product.getNoOfProduct()));
				System.out.println("Product count " +product.getNoOfProduct() + " VS5 $" + totalPrice );

			}

			else if (product instanceof MB11) {

				totalPrice = totalPrice.add(MB11.total(product.getNoOfProduct()));
				System.out.println("Product count " +product.getNoOfProduct() + " MB11 $" + totalPrice );

			}

			else if (product instanceof CF) {

				totalPrice = totalPrice.add(CF.total(product.getNoOfProduct()));
				System.out.println("Product count " +product.getNoOfProduct() + " CF $" + totalPrice );
			}

		}

		return totalPrice;

	}
}
