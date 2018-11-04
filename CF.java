package com.hexad.Bakery;

import java.math.BigDecimal;

public class CF extends Product {

	public CF(String productName, int noOfProduct) {
		super(productName, noOfProduct);

	}

	public static BigDecimal total(int count) {

		BigDecimal totalPrice = new BigDecimal("0.00");

		while (count != 0) {
			if (count / 9 != 0 && count % 9 != 1 && count % 9 != 4) {
				System.out.println("Pack of 9 is $16.99");
				totalPrice = totalPrice.add(new BigDecimal("16.99").multiply(new BigDecimal(count / 9)));
				System.out.println("Pack of 9 *" + (count / 9) + "= $" + totalPrice);
				count = count % 9;

			} else if (count / 5 != 0) {
				System.out.println("Pack of 5 is $9.95");
				totalPrice = totalPrice.add(new BigDecimal("9.95").multiply(new BigDecimal(count / 5)));
				System.out.println("Pack of 5 *" + (count / 5) + "= $" + totalPrice);
				count = count % 5;

			}

			else if (count / 3 != 0) {
				System.out.println("Pack of 3 is $5.95");
				totalPrice = totalPrice.add(new BigDecimal("5.95").multiply(new BigDecimal(count / 3)));
				System.out.println("Pack of 3 *" + (count / 3) + "= $" + totalPrice);
				count = count % 3;

			}

		}

		return totalPrice;
	}

	private static void output(int count, BigDecimal totalPrice) {
		System.out.println("Pack of " + count + " of CF $" + totalPrice);
	}

}
