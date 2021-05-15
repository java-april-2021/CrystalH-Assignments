package com.crystal.show.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crystal.show.models.Book;
import com.crystal.show.services.BookService;

// ... imports removed for brevity
@Controller
public class BooksController {
	private final BookService bookService;
    public Books(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books.jsp";
    }
    @RequestMapping("/books/{index}")
    public String findBookByIndex(Model model, @PathVariable("index") int index) {
        Book book = bookService.findBookByIndex(index);
        model.addAttribute("book", book);
        return "showBook.jsp";
    }
}

