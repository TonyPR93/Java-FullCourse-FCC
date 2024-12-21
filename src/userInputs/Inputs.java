package userInputs;

import java.util.Scanner;

public class Inputs {
	// scanner object 
	public static void main(String[] args) {
		//On peut aussi scan un files ou autre
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Whats's your name? \n"); // Pas de nouvelle ligne avec print mais oui a cause du \n
		
		String name = scanner.nextLine();
		
		System.out.println(name);
		System.out.printf("Hello %s, how old are you ?", name);
		
		int age = scanner.nextInt();
		//On clean le buffer
		//int age = Integer.parseInt(scanner.nextLine());
		scanner.nextLine();
		
		System.out.printf("%d is a excelent age to begin, what languages do you prefer", age);
		
		String language = scanner.nextLine();
		
		System.out.printf("%s is fun !!", language);
		
		scanner.close();
	}

}
