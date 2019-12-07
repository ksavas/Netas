package com.netas.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.netas.demo.models.Book;
public interface BookDao extends JpaRepository<Book,Integer> { 

}
