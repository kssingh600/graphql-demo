package com.kdacademy.graphql.graphqlproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kdacademy.graphql.graphqlproject.entities.Book;
import com.kdacademy.graphql.graphqlproject.services.BookService;

@SpringBootApplication
public class GraphqlprojectApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService ;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book() ;
		b1.setTitle("Java Full Stack");
		b1.setDesc("This course convers the entire full stack development using Java");
		b1.setPages(200);
		b1.setPrice(500);
		b1.setAuthor("Kuldeep Singh");

		Book b2 = new Book() ;
		b2.setTitle("MERN Stack");
		b2.setDesc("This course teaches full stack using React and Node");
		b2.setPages(500);
		b2.setPrice(1000);
		b2.setAuthor("Nayab Hussain");

		Book b3 = new Book() ;
		b3.setTitle("MEAN Stack");
		b3.setDesc("This course teaches full stack using Angular and Node");
		b3.setPages(500);
		b3.setPrice(1000);
		b3.setAuthor("Ajay Para");

		this.bookService.create(b1) ;
		this.bookService.create(b2) ;
		this.bookService.create(b3) ;
	}

	

}
