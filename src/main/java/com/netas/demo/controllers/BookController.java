package com.netas.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netas.demo.models.Book;
import com.netas.demo.services.BookService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("books")
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@GetMapping("/")
	@ApiOperation("lists all the books")
	public List<Book> getBooks(){
		
		return new ArrayList<Book>() {{add(new Book());}};
	}

	@PostMapping("/")
	@ApiOperation("inserts new book")
	public Book insertNewBook(@RequestBody Book newBook) {
		return bookService.insertNewBook(newBook);
	}
	
	
	
	
}