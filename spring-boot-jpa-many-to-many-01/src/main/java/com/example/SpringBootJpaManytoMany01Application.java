package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;

@SpringBootApplication
public class SpringBootJpaManytoMany01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaManytoMany01Application.class, args);
	}

	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private AuthorRepository authorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book("book1", "book1 description");
		Book b2 = new Book("book2", "book2 description");
		
		Author a1 = new Author("author1");
		Author a2 = new Author("author2");
	
		//one book have multiple authors
		b1.getAuthors().add(a1);
		b1.getAuthors().add(a2);
		b2.getAuthors().add(a1);
		
		//multiple authors have one book
		a1.getBooks().add(b1);
		a2.getBooks().add(b1);
		a1.getBooks().add(b2);
		
		
//		a1.getBooks().add(b2);
//		b2.getAuthors().add(a1);
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		
	}

}
