package com.connectiondb.belajarjpaspring;

import com.connectiondb.belajarjpaspring.entity.Book;
import com.connectiondb.belajarjpaspring.entity.BookCategory;
import com.connectiondb.belajarjpaspring.repository.BookCategoryRepository;
import com.connectiondb.belajarjpaspring.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BelajarjpaspringApplication implements CommandLineRunner {
private  final Logger LOG=
        LoggerFactory.getLogger(SpringApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BelajarjpaspringApplication.class, args);
    }
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookCategoryRepository bookCategoryRepository;
    @Override
    public  void run(String ... args) throws  Exception{
        // create Book Category
        BookCategory bookCategory = bookCategoryRepository.save(new
                BookCategory("Programming", new Book("Java 1","Teten N.","SEI92002"), new
                Book("Java 2","Teten N.","UEOEI829")));
        LOG.info("BookCategory : "+bookCategory);
    }

}
