package com.hexad.Bakery;

import java.math.BigDecimal;

public class VS5 extends Product {

	public VS5(String productName, int noOfProduct) {
		super(productName, noOfProduct);

	}

	public static BigDecimal total(int count) {

		BigDecimal totalPrice = new BigDecimal("0.00");
		while (count != 0) {
			
			if (count<0 ||count==4||count==7)
				throw new IllegalArgumentException("Count must be multiple or addition of 3 and 5");
			if(count%5==4)
				throw new IllegalArgumentException("Count must be multiple or addition of 3 and 5");
			if (count / 5 != 0 && (count % 5 != 1 || count % 5 != 2)) {

				System.out.println("Pack of 5 is $8.99");
				totalPrice = totalPrice.add(new BigDecimal("8.99").multiply(new BigDecimal(count / 5)));
				System.out.println("Pack of 5 *" + (count / 5) + "= $" + totalPrice);

				count = count % 5;
			} else if (count % 3 == 0) {
				System.out.println("Pack of 3 is $6.99");
				totalPrice = totalPrice.add(new BigDecimal("6.99").multiply(new BigDecimal(count / 3)));
				System.out.println("Pack of 3 *" + (count / 3) + "= $" + totalPrice);
				count = count % 3;

			}

		}
		return totalPrice;

	}

	private static void output(int count, BigDecimal totalPrice) {
		System.out.println("Pack of " + count + " of VS5 $" + totalPrice);
	}

}
