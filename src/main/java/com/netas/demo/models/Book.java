package com.netas.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_T", schema = "bookdb")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int bookId;
	
	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "author", length = 255)
	private String author;
	
	@Column(name = "description", length = 255)
	private String description;
	

	@Column(name = "release_year")
	private int year;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
}
