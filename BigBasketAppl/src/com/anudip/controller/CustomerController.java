package com.anudip.controller;

import java.util.List;
import java.util.Scanner;

import com.anudip.model.Customer;
import com.anudip.model.Product;
import com.anudip.service.CustomerServiceImpl;

public class CustomerController {

	public static void main(String[] args) {
		

		CustomerServiceImpl  custImpl = new CustomerServiceImpl();

			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. Add Customer");
				System.out.println("2. View Customer");
				System.out.println("3. View All Customer");
				System.out.println("4. Update Customer");
				System.out.println("5. Delete Customer");

				System.out.println("Enter your choice, what opearation you want to perfrom");
				int choice = sc.nextInt();



				switch(choice) {
				case 1 :
					System.out.println("++++++++++++Add Customer Opearation++++++++++++");


					System.out.println("Enter customer ID ::");
					int pid = sc.nextInt();

					System.out.println("Enter customer name ::");
					String pname = sc.next();

					System.out.println("Enter customer mob ::");
					long mobNo = sc.nextLong();
					
					System.out.println("Enter customer addrs ::");
					String addrs = sc.next();

					Customer cust = new Customer(pid,pname, mobNo,addrs);		
					String result = custImpl.addCustomer(cust);
					System.out.println(result);
					break;

				case 2 :
					
					break;


				case 3 :
				
					List<Customer> viewAllCustomer = custImpl.viewAllCustomer();
					System.out.println("+++++++++++++++ALl CUstomer List++++++++++++");
					for(Customer c : viewAllCustomer) {
						System.out.println(c);
					}
					break;


				case 4 :
					System.out.println("++++++++++++udpate  Customer++++++++++++++");
					System.out.println("eneter customer id,  you want to update???");
					System.out.println("enetr cust id");
					int cid = sc.nextInt();
					
					Customer custt = new Customer();
					
					System.out.println("enter updated customer name");
					String updatedcustName = sc.next();
					
					custt.setCname(updatedcustName);
					
					boolean resulttt = custImpl.updateCustomer(cid, custt);
					
					if(resulttt) {
						System.out.println("customer updated successfulyy");
					}else {
						System.out.println("custome rnot updated");
					}
								
					break;

				case 5:
					System.out.println("++++++++++++Delete customer+++++++++++++++");
					
					System.out.println("enetr cust id whioch cutemer u want to delete");
					int iddd = sc.nextInt();
					String deleteCustomer = custImpl.deleteCustomer(iddd);					
					System.out.println(deleteCustomer);
					break;

				default :
					System.out.println("Invalid choice");

				}

			}

		}
	}
