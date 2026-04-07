package com.anudip.service;

import java.util.ArrayList;
import java.util.List;

import com.anudip.model.Product;

public class ProductServiceImpl implements IProductService{

	ArrayList<Product> al = new ArrayList<Product>();

	@Override
	public String addProduct(Product prod) {
		al.add(prod);		
		return "Product Added Successfully";
	}

	@Override
	public Product getProductById(int productId) {
		
		for(Product p : al) {
			if(p.getProductId() == productId) {
				return p;
			}
		}
		
		return null;
	}

	@Override
	public List<Product> getAllProductList() {		
		return al;
	}

	@Override
	public String updateProduct(int id, Product updatedProd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
