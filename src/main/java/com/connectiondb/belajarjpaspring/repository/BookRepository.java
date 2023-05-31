package com.connectiondb.belajarjpaspring.repository;

import com.connectiondb.belajarjpaspring.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
