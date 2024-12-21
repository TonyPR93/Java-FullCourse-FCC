package conditional;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		double number1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Enter the 2st number");
		double number2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println(number1 +" and "+ number2);
		
		System.out.print("What operation do you want ?");
		String operation = scanner.nextLine();
		
		if(operation.equals("sum")) {
			System.out.printf("%f + %f = %f", number1, number2, number1+number2);
		} else if (operation.equals("sub")) {
			System.out.printf("%f - %f = %f", number1, number2, number1-number2);
		} else if (operation.equals("div")) {
			if(number2 == 0) {
				System.out.println("Can't divide by 0");
			} else {
				System.out.printf("%f / %f = %f", number1, number2, number1/number2);				
			}
		}else {
			System.out.printf("%s is not suported", operation);
		}
		scanner.close();

	}

}
