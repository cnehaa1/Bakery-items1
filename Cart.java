package com.hexad.Bakery;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Cart {
@Autowired
	private CF;
///////////sdfdslkjfsdlakjfdlskjfdslkajsadlkfjdslkfjdlsk
////////////////sdfsdlkjfdslkjsdlkfdsjslkdjsdkl
	
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
				
			
				System.out.println("Product count " +product.getNoOfProduct() + " VS5 $" + VS5.total(product.getNoOfProduct())) ;

			}

			else if (product instanceof MB11) {

				
				System.out.println("Product count " +product.getNoOfProduct() + " MB11 $" + MB11.total(product.getNoOfProduct()) );

			}

			else if (product instanceof CF) {

				
				System.out.println("Product count " +product.getNoOfProduct() + " CF $" + CF.total(product.getNoOfProduct()) );
			}

		}

		return totalPrice;

	}
}
