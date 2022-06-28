package com.product.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.product.app.entity.OrderDetailsEntity;
import com.product.app.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		OrderDetailsRepository bean = context.getBean(OrderDetailsRepository.class);
		OrderDetailsEntity entity = new OrderDetailsEntity();
		entity.setOrderBy("suneel");
		entity.setOrderPlacedDate(new Date());
		bean.save(entity);
		System.out.println(entity);
		context.close();
	}

}
