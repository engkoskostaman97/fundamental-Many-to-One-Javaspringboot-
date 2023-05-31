package com.connectiondb.belajarjpaspring.repository;

import com.connectiondb.belajarjpaspring.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository  extends JpaRepository<BookCategory, Long> {
}
