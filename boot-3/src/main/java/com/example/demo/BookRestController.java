package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	//By using HATEOS example
	@GetMapping("/book/{isbn}")
	public Book getBookInfo(@PathVariable("isbn") String isbn)
	{
		Book b = new Book(isbn,"Spring",500.00,"Rod Jonson");
//		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks()).withSelfRel();
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks()).withRel("all-books");
		b.add(link);
		return b;
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		Book b1 = new Book("ISBN001","Spring",300.00,"Rod Jonson");
		Book b2 = new Book("ISBN002","Java",450.00,"Jack");
		Book b3 = new Book("ISBN003","Spring Boot",700.00,"Josef");
		Book b4 = new Book("ISBN004","MicroServices",658.92,"Steven");
		
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b3);
		listOfBooks.add(b4);
		return listOfBooks;
	}
}
