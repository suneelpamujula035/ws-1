package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class JunitDemo1ApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	@Order(1)
	public void testSave()
	{
		Product product = new Product();
		product.setId(101L);
		product.setName("Mobile");
		product.setDescription("Samsung Mobile");
		product.setPrice(15000);
		productRepository.save(product);
		assertNotNull(productRepository.findById(101L).get());
	}
	
	@Test
	@Order(2)
	public void testGetAll()
	{
		List<Product> listOfProducts = productRepository.findAll();
		assertThat(listOfProducts).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testGetProductById()
	{
		Product product = productRepository.findById(101L).get();
		assertEquals(15000.00, product.getPrice());
	}
	
	@Test
	@Order(4)
	public void testUpdate()
	{
		Product product = productRepository.findById(101L).get();
		product.setPrice(18000);
		productRepository.save(product);
		assertNotEquals(15000.00, productRepository.findById(101L).get().getPrice());
	}
	
	@Test
	@Order(5)
	public void testDelete()
	{
		productRepository.deleteById(101L);
		assertThat(productRepository.existsById(101L)).isFalse();
	}

}
