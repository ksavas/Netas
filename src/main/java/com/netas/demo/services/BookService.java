package com.netas.demo.services;

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
	
}
