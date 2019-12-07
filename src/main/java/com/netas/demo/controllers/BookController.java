package com.netas.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return bookService.getAllBooks();
	}

	@PostMapping("/")
	@ApiOperation("inserts new book")
	public Book insertNewBook(@RequestBody Book newBook) {
		return bookService.insertNewBook(newBook);
	}
	
	@GetMapping("/{id}")
	@ApiOperation("finds specific book")
	public Optional<Book> getBook(@PathVariable("id") int bookId) {
		return bookService.getBook(bookId);
	} 
	
	@PutMapping("/{id}")
	@ApiOperation("updates specific book")
	public Book updateBook(@RequestBody Book updatedBook) {
		return bookService.updateBook(updatedBook);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation("deletes specific book")
	public void DeleteBook(@PathVariable("id") int bookId) {
		bookService.deleteBook(bookId);
	}
	
}