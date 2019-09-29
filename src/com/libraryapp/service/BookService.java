package com.libraryapp.service;

import java.util.List;

import com.libraryapp.entity.Book;

public interface BookService {
	
	List<Book> getBooks();
	
	Book addBook(Book book);
	
	Book deleteBook(Book book);
		
	Book updateBook(Book book);

}
