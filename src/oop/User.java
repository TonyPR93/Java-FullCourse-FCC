package oop;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
	private String name;
	private LocalDate birthday;
	//Un utilisateur possede 0 a plusieurs livres
	private ArrayList<Book> books = new ArrayList<Book>();
	public void borrow(Book book) {
		this.books.add(book);
	}	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	User(String name, String birthday){
		this.name=name;
		this.birthday=LocalDate.parse(birthday);
	}
	public int age() {
		int age = Period.between(this.birthday, LocalDate.now()).getYears();
		return age;
	}
}
