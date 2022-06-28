package com.product.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.app.entity.Product;
import com.product.app.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/products")
@Api("This is Amazon Product Controller")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@ApiOperation("This method is for saving list of products")
	@PostMapping
	public ResponseEntity<String> saveProducts(@RequestBody List<Product> products)
	{
		return new ResponseEntity<String>( productService.saveProducts(products),HttpStatus.CREATED);
	}
	
	@ApiOperation("This method is for getting list of products")
	@GetMapping
	public ResponseEntity<List<Product>> getProducts()
	{
		return new ResponseEntity<List<Product>>(productService.getProducts(),HttpStatus.OK);
	}
	
	@ApiOperation("This method is for getting product by id")
	@GetMapping("{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id)
	{
		return new ResponseEntity<Product>(productService.getProduct(id), HttpStatus.OK);
	}
	
	@ApiOperation("This method is for updating product by id")
	@PutMapping("{id}")
	public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product product)
	{
		return new ResponseEntity<String>(productService.updateProduct(product, id), HttpStatus.OK);
	}
	
	@ApiOperation("This method is for deleting product by id")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id)
	{
		return new ResponseEntity<String>(productService.deleteProduct(id), HttpStatus.OK);
	}
}
