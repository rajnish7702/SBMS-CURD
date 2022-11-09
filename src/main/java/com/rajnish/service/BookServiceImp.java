package com.rajnish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rajnish.entity.Book;
import com.rajnish.repo.BookRepository;

@Service
public class BookServiceImp implements BookService {

	private BookRepository repository;
	public BookServiceImp(BookRepository repository) {
		this.repository=repository;
	}
	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		Book save = repository.save(book);
		if(bookId==null) {
			return "recored inserted";
		}
		else {
			return "recored updated";
		}
	}

	@Override
	public List<Book> getAllBook() {
		
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "book deleted";
	}

}
