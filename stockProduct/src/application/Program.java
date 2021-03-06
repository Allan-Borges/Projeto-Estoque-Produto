package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product prod = new Product(name, price, quantity);
		System.out.println();
		System.out.println("Product data: ");
		System.out.println(prod);
		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		quantity = sc.nextInt();
		System.out.println();
		prod.addProducts(quantity);
		System.out.println("Updated data: " + prod);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		prod.removeInStock(quantity);
		System.out.println();
		System.out.println("Updated data: " + prod);

		sc.close();
	}

}
