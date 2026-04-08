package com.anudip.service;

import java.util.List;

import com.anudip.model.Customer;

public interface ICUstomerService {

	public abstract	String addCustomer(Customer cust);
	public abstract	Customer viewCustomer(int custId);
	public abstract	List<Customer> viewAllCustomer();
	public abstract	boolean updateCustomer(int id, Customer updateCustomer);
	public abstract	 String deleteCustomer(int cid);
}
