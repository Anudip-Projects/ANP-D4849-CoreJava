package com.anudip.service;

import java.util.List;

import com.anudip.model.Product;

public interface IProductService {

	public abstract	String addProduct(Product prod);
	public abstract Product getProductById(int productId);
	public abstract List<Product> getAllProductList();
	public abstract String updateProduct(int id, Product updatedProd);
	public abstract String deleteProduct();

}
