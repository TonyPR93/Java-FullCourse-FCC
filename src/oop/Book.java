package oop;

public class Book {
	private String title;
	private String author;
	private int pageBook;
	
	public Book(String title, String author, int pageBook) {
		this.title = title;
		this.author = author;
		this.pageBook = pageBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPageBook() {
		return this.pageBook;
	}

	public String toString() {
		return this.title+" from "+this.author+" and contain "+ this.pageBook+" pages";
		
	};
}
