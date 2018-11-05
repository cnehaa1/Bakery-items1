package com.hexad.Bakery;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakeryShop3Application {

	public static void main(String[] args) {
		SpringApplication.run(BakeryShop3Application.class, args);

		Cart cart = new Cart();

		Scanner scanObject = new Scanner(System.in);
		int quantity;

		boolean exit = false;
		do {
			System.out.println("Enter the details of products ordered");
			System.out.println("1  VS5");
			System.out.println("2 MB11");
			System.out.println("3 CF");
			System.out.println("4 Exit");
			int choice = scanObject.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter VS quantity");
				quantity = scanObject.nextInt();
				cart.add(new VS5("VS5", quantity));
				break;
			case 2:
				System.out.println("Enter MB11 quantity");
				quantity = scanObject.nextInt();
				cart.add(new MB11("MB11", quantity));
				break;
			case 3:
				System.out.println("Enter CF quantity");
				quantity = scanObject.nextInt();
				cart.add(new CF("CF", quantity));
				break;
			case 4:
				exit = true;
				break;
			}
		} while (!exit);

		System.out.println("Total cost to pay $" + cart.total());

	}
}
