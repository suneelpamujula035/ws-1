package com.product.app.service;

import java.util.List;

import com.product.app.entity.Product;

public interface ProductService {

	public String saveProducts(List<Product> products);
	public List<Product> getProducts();
	public Product getProduct(int id);
	public String updateProduct(Product product, int id);
	public String deleteProduct(int id);
	
}
