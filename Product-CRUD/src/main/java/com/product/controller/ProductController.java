package com.product.controller;

import com.product.entity.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> saveProducts(@RequestBody List<Product> products)
    {
        return new ResponseEntity<String>(productService.saveProducts(products), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts()
    {
        return new ResponseEntity<List<Product>>(productService.getProducts(), HttpStatus.ACCEPTED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable long id)
    {
        return new ResponseEntity<Product>(productService.getProduct(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product)
    {
        return new ResponseEntity<Product>(productService.updateProduct(id, product), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String > deleteProduct(@PathVariable long id)
    {
        return new ResponseEntity<String>(productService.deleteProduct(id), HttpStatus.OK);
    }
}
