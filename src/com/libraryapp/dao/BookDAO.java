package com.libraryapp.dao;

import java.util.List;

import com.libraryapp.entity.Book;

public interface BookDAO {
	
	List<Book> getBooks();
	
	void addBook(Book book);
	
	void deleteBook(Book book);
	
	Book getBook(String id);
	
	void updateBook(Book book);

}
