package com.product.service;

import com.product.entity.Product;
import com.product.exception.ProductNotFoundException;
import com.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String saveProducts(List<Product> products) {
        List<Product> products1 = productRepository.saveAll(products);
        return "Number of products saved : "+products1.size();
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product Not found with ID : "+id));
    }

    @Override
    public Product updateProduct(long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product Not found with ID : " + id));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    @Override
    public String deleteProduct(long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product Not found with ID : " + id));
        productRepository.deleteById(id);
        return "Product successfully deleted with ID : "+id;
    }
}
