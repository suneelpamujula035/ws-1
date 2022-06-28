package com.product.service;

import com.product.entity.Product;

import java.util.List;

public interface ProductService {

    public String saveProducts(List<Product> products);
    public List<Product> getProducts();
    public Product getProduct(long id);
    public Product updateProduct(long id, Product product);
    public String deleteProduct(long id);
}
