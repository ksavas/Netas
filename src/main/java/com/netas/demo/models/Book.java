package com.netas.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Book_T", schema = "bookdb")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public int bookId;
	
	@Column(name = "name", length = 255)
	public String name;
	
	@Column(name = "author", length = 255)
	public String author;
	
	@Column(name = "description", length = 255)
	public String description;
	
	@Column(name = "release_year")
	public int year;
	
	
}
