package com.crystal.show.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.crystal.show.models.Book;
import com.crystal.show.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bRepo;
	
	public BookService(BookRepository bRepo) {
		this.bRepo = bRepo;
	}
	
	public List<Book> getAllBooks(){
		return this.bRepo.findAll();
	}
	
	public Book getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	
	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}
	
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}
	
	public Book findBook(Long id) {
        Optional<Book> optionalBook = bRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
}
