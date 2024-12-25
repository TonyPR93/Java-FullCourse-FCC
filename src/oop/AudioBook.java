package oop;

public class AudioBook extends Book{
	private int runtime;
	
	public AudioBook(String title, String author, int runtime) {
		super(title, author, 0); //fait appel au constructeur parent
		this.runtime=runtime;
	}
}
