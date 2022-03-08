package com.api.rest.books.BooksService.bookservices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.rest.books.BooksService.entities.Book;

@Component
public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(10,"java","james gosling","100M","This java OOP Language!","4-4-1994"));
		list.add(new Book(20,"C Programming","Denis","80M","This C Procedural Language!","10-1-1988"));
		list.add(new Book(30,"C++","Denis","90M","This C++ OOP and proceduralLanguage !","15-10-1992"));
		list.add(new Book(40,"Python","","90M","This Pthon OOP and Script Language!","20-11-2000"));
		list.add(new Book(50,"Html","abc","80M","This java OOP Language!","10-12-1998"));
		list.add(new Book(60,"CSS","xyz","90M","This java OOP Language!","25-4-1998"));
		list.add(new Book(70,"Mysql","mno","80M","This java OOP Language!","24-8-1999"));
		
	}
	//Get All Books
	public List<Book>getAllBooks(){
		return list;
	}
	// Get Single book by id
	public Book getBookById(int id)
	{
		Book book=null;
		try {
			book=list.stream().filter(e->e.getId()==id).findFirst().get();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return book;
	}
	//adding the book
	public Book addBook(Book b)
	{
		list.add(b);
		
		return b;
	}
	
	//deleting the book
	public void deleteBook(int bid)
	{
		list=list.stream().filter(book->book.getId()!=bid)
			.collect(Collectors.toList());
	}
	
	//Update book
	public void updateBook(Book book,int bookid)
	{
		list=list.stream().map(b->{
			if(b.getId()==bookid)
			{
				b.setTitle(book.getTitle());
				b.setAuther(b.getAuther());
				b.setSell(b.getSell());
				b.setDesc(b.getDesc());
				b.setReleasedate(b.getReleasedate());
				
			}
			return b;
		}).collect(Collectors.toList());
	}

}
