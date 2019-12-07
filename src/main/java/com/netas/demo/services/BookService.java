package com.netas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netas.demo.dao.BookDao;
import com.netas.demo.models.Book;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;
	
	public Book insertNewBook(Book newBook) {
		return bookDao.save(newBook);
	}
	
	
	public List<Book> getAllBooks(){
		return bookDao.findAll();
	}
	
	public Optional<Book> getBook(int id) {
		return bookDao.findById(id);
	}
	
	public Book updateBook(Book updatedBook) {
		Optional<Book> existingBookOptional = getBook(updatedBook.getBookId());
		if(existingBookOptional.isPresent()) {
			Book existingBook = existingBookOptional.get();
			existingBook.setAuthor(updatedBook.getAuthor());
			existingBook.setDescription(updatedBook.getDescription());
			existingBook.setName(updatedBook.getName());
			existingBook.setYear(updatedBook.getYear());
			return bookDao.save(existingBook);
		}
		else {
			throw new RuntimeException("Book does not exist");
		}
	}
	
	public void deleteBook(int bookId) {
		Optional<Book> existingBookOptional = getBook(bookId);
		if(existingBookOptional.isPresent()) {
			bookDao.delete(existingBookOptional.get());
		}
		else {
			throw new RuntimeException("Book does not exist");
		}
	}
	
}
