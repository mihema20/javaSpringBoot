package com.example.exemple1;

public class Book {
	
	private String title;
	private String author;
	private int page;
	private int year;
	private String ISBN;
	
	public String getTitle() {
		return title;
	}
	
	public Book() {
		super();
	}

	public Book(String title, String author, int page, int year, String iSBN) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
		this.year = year;
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + ", year=" + year + ", ISBN=" + ISBN
				+ "]";
	}

 
}
