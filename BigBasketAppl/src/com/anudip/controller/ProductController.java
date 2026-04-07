package com.anudip.controller;

import java.util.List;
import java.util.Scanner;

import com.anudip.model.Product;
import com.anudip.service.ProductServiceImpl;

public class ProductController {

	public static void main(String[] args) {

		ProductServiceImpl  prodImpl = new ProductServiceImpl();

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Add Product");
			System.out.println("2. View Product");
			System.out.println("3. View All Product");
			System.out.println("4. Update Product");
			System.out.println("5. Delete Product");

			System.out.println("Enter your choice, what opearation you want to perfrom");
			int choice = sc.nextInt();



			switch(choice) {
			case 1 :
				System.out.println("++++++++++++Add Product Opearation++++++++++++");


				System.out.println("Enter product ID ::");
				int pid = sc.nextInt();

				System.out.println("Enter product name ::");
				String pname = sc.next();

				System.out.println("Enter product Prize ::");
				double prodPrize = sc.nextDouble();

				Product prod = new Product(pid, pname, prodPrize);			
				String result = prodImpl.addProduct(prod);
				System.out.println(result);
				break;

			case 2 :
				System.out.println("++++++++++++view Product Opearation++++++++");
				System.out.println("Enter product ID, which product you want to get");
				int prodID = sc.nextInt();
				Product result2 = prodImpl.getProductById(prodID);
				System.out.println(result2);
				break;


			case 3 :
				System.out.println("++++++++++++view All Product Opearation++++++++");
				List<Product> allProductList = prodImpl.getAllProductList();

				for(Product p : allProductList) {
					System.out.println(p);
				}
				break;


			case 4 :
				System.out.println("++++++++++++udpate  Product++++++++++++++");
				break;

			case 5:
				System.out.println("++++++++++++Delete Product+++++++++++++++");
				break;

			default :
				System.out.println("Invalid choice");

			}

		}

	}
}
