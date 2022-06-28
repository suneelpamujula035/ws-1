package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Cart;
import com.example.entity.Item;
import com.example.repository.CartRepository;
import com.example.repository.ItemRepository;

@SpringBootApplication
public class SpringBootJpaManyToOne02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaManyToOne02Application.class, args);
	}

	@Autowired
	private ItemRepository itemRepo;
	@Autowired
	private CartRepository cartRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cart c1 = new Cart("Amazon cart");
		Cart c2 = new Cart("Flipkart cart");
		
		Item i1 = new Item("mobile phone", 3, c1);
		Item i2 = new Item("shirts", 14, c1);
		Item i3 = new Item("shoes", 8, c1);
		Item i4 = new Item("washing machine", 1, c2);
		Item i5 = new Item("refrigirator", 4, c2);
		
		itemRepo.saveAll(Arrays.asList(i1,i2,i3,i4,i5));
	}

}
