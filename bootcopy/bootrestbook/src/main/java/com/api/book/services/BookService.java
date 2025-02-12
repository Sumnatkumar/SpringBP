package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		try {
			book = list.stream().filter(e->e.getId()==id).findFirst().get();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return book;
	}
	
//	adding the book
	
	public Book addBook(Book b)
	{
		list.add(b);
		return b;
	}
	
//	delete book
	
	public void deleteBook(int bid)
	{
		list = list.stream().filter(book ->book.getId() != bid)
		.collect(Collectors.toList());
	}
	
//	update the book
	public void updateBook(Book book, int bookId)
	{
		list = list.stream().map(b->{
			if(b.getId()==bookId)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}
}
