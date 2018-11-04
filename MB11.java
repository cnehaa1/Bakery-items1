package com.hexad.Bakery;

import java.math.BigDecimal;

public class MB11 extends Product {

	public MB11(String productName, int noOfProduct) {
		super(productName, noOfProduct);
		System.out.println("Entered into MB11");
	}

	public static BigDecimal total(int count) {
		BigDecimal totalPrice = new BigDecimal("0.00");
		while (count != 0) {
			if (count / 8 != 0 && count % 8 != 1) {
				System.out.println("Pack of 8 is $24.95");
				totalPrice = totalPrice.add(new BigDecimal("24.95").multiply(new BigDecimal(count / 8)));
				System.out.println("Pack of 8 *" + (count / 8) + "= $" + totalPrice);

				count = count % 8;

			}

			else if (count / 5 != 0 && count % 5 != 1) {
				System.out.println("Pack of 5 is $16.95");
				totalPrice = totalPrice.add(new BigDecimal("16.95").multiply(new BigDecimal(count / 5)));
				System.out.println("Pack of 5 *" + (count / 5) + "= $" + totalPrice);

				count = count % 5;

			}

			else if (count / 2 != 0) {
				System.out.println("Pack of 2 is $9.95");
				totalPrice = totalPrice.add(new BigDecimal("9.95").multiply(new BigDecimal(count / 2)));
				System.out.println("Pack of 2 *" + (count / 2) + "= $" + totalPrice);

				count = count % 2;

			} else if (count % 8 == 5) {
				totalPrice = totalPrice.add(new BigDecimal("24.95").multiply(new BigDecimal(count / 8)));

				count = count % 8;
			}

			else if (count % 5 == 2) {
				totalPrice = totalPrice.add(new BigDecimal("16.95").multiply(new BigDecimal(count / 5)));

				count = count % 5;
			}
		}

		return totalPrice;
	}

}
