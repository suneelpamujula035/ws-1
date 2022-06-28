package com.product.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.entity.Product;
import com.product.app.repository.ProductRepository;
import com.product.custom_exception.ProductNotFound;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public String saveProducts(List<Product> products) {
		List<Product> batchOfProducts = productRepo.saveAll(products);
		return "Number of products saved : "+batchOfProducts.size();
	}

	@Override
	public List<Product> getProducts() {
		List<Product> listOfProducts = productRepo.findAll();
		return listOfProducts;
	}

	@Override
	public Product getProduct(int id) {
		Product product = productRepo.findById(id).orElseThrow(()-> new ProductNotFound("There is no product with id number : "+id));
		return product;
	}

	@Override
	public String updateProduct(Product product, int id) {
		Product existingProduct = productRepo.findById(id).orElseThrow(()-> new ProductNotFound("There is no product with id number : "+id));
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		productRepo.save(existingProduct);
		return "Product Successfully updated with id : "+id;
	}

	@Override
	public String deleteProduct(int id) {
		Product product = productRepo.findById(id).orElseThrow(()-> new ProductNotFound("There is no product with id number : "+id));
		productRepo.deleteById(id);
		return "Product successfully deleted with id : "+id;
	}
}
