package loops;

public class While {
	public static void main(String[] arguments) {
		int number = 5;
		int index = 0;
		
		/**Si n'accomplit pas la condition, rentre 0 fois**/
		while (index < number) {
			System.out.printf("%d x %d = %d \n", number, index, number*index);
			index++;
		}
		
		
		/**Rentre au minimum 1 fois et ensuite check la condition**/
		System.out.println("do while");
		index=10;
		do {
			System.out.printf("%d x %d = %d \n", number, index, number*index);
			index++;
		}while(index < number);
	}
}
