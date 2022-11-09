package com.rajnish.service;

import java.util.List;

import com.rajnish.entity.Book;

public interface BookService {
	public String upsertBook(Book book);
	public List<Book> getAllBook();
	public String deleteBook(Integer bookId);
}
