package com.example.exemple1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	static List <Book> books = new ArrayList<Book>();
	
	static {
		//String title, String author,pag, int year, String iSBN
		Book book1 = new Book ("Anna Karenina", "Tolstoi", 562, 1896, "dgsdgs");
		Book book2 = new Book ("Libro 2", "Tolstoi", 52, 186, "dreyftty");
		books.add(book1);
		books.add(book2);
	}
	
	public List<Book> queryBook(){
		
		return books;
	}
}
