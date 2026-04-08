package com.anudip.service;

import java.util.ArrayList;
import java.util.List;

import com.anudip.model.Customer;

public class CustomerServiceImpl implements ICUstomerService{

	ArrayList<Customer> custAl = new ArrayList<Customer>();
	
	@Override
	public String addCustomer(Customer cust) {
		custAl.add(cust);
		return "Customer added successfully";
	}

	@Override
	public Customer viewCustomer(int cid) {
		for(Customer c : custAl) {
			if(c.getCid() == cid) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Customer> viewAllCustomer() {		
		return custAl;
	}

	@Override
	public boolean updateCustomer(int id, Customer updaCUst) {
	
		
		for(int i = 0; i<=custAl.size(); i++) {
			Customer customer = custAl.get(i);   //0th 
			
			if(customer.getCid() == id) {				
				customer.setCname(updaCUst.getCname());
				customer.setMobno(updaCUst.getMobno());
				customer.setAddrs(updaCUst.getAddrs());
				return true;
			}
		}
		return false;
	}

	@Override
	public String deleteCustomer(int cid) {	
		for(Customer cc : custAl) {
			if(cc.getCid() == cid) {
				custAl.remove(cc);
				return "Custeomer deleted successfully";
			}
		}
		return "customer not found to delete";
	}

}
