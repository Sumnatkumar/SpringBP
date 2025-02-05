package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
	
	static {
		
		list.add(new Book(12, "Java Complete Reference " , "XYZ"));
		list.add(new Book(36, "Head First to Java " , "ABC"));
		list.add(new Book(12963, "Think in Java " , "LMN"));
	}
	
//	get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
//	get single book by id
	public Book getBookById(int id) 
	{
		
		Book book = null;
		book = list.stream().filter(e->e.getId()==id).findFirst().get();
		
		return book;
	}
	
//	adding the book
	
	public Book addBook(Book b)
	{
		list.add(b);
		return b;
	}
}
