package com.example.exemple1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//la etiqueta le dice a la clase que es controlador 
@RestController
@RequestMapping("api")
public class BookRestController {
	@Autowired
	BookService bookservice;
	
	// creación de end point rest api
	@GetMapping("books")
	public Iterable<Book> getAllBooks(){
		
		
		return bookservice.queryBook();
	}

}
