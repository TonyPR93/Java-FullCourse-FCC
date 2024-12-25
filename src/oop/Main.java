package oop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User firstUser = new User();
		//User secondUser = new User();
		User user = new User("Rafa", "1999-12-14");
		
		Book book = new Book("Titre du livre","Truc", 207);
		Book book2 = new Book("Titre du livre2","Truc", 180);
		AudioBook audioBook = new AudioBook("titre3", "pamela", 360);
		
		//book.title = "Titre du livre";
		//book.author = "Truc";
		
		//firstUser.name = "Tony";
		//firstUser.birthday=LocalDate.parse("1993-07-07");
		
		//secondUser.name = "Rafa";
		//secondUser.birthday=LocalDate.parse("1999-12-14");
		
		//user.name = "Rafa";
		//user.birthday=LocalDate.parse("1999-12-14");
		user.borrow(book);
		user.borrow(book2);
		user.borrow(audioBook);
		
		//System.out.println(firstUser); //retourne la référence
		//System.out.println(firstUser.name + " birthday is " + firstUser.birthday + " he's " + firstUser.age());
		
		//System.out.println(secondUser); //retourne la référence
		//System.out.println(secondUser.name + " birthday is " + secondUser.birthday + " he's " + secondUser.age());
	
		System.out.println(user); //retourne la référence
		System.out.println(user.getName() + " birthday is " + user.getBirthday() + " he's " + user.age() + " and have those books : " + user.getBooks() );
		
		System.out.println();
	}

}
