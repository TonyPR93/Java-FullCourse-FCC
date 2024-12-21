package arrayAsList;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayAsList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// int double float boolean -> Primitive
		//Integer Double Float Boolean
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
	
		System.out.println(numbers.toString()); // see all values
		System.out.println(numbers.get(0)); // see specifical value
		
		
		//remove by index
		numbers.remove(0);
		System.out.println(numbers.toString());
		
		//remove specifical value
		numbers.remove(Integer.valueOf(2));
		System.out.println(numbers.toString());
		
		//remove all
		numbers.clear();
		System.out.println(numbers.toString());
		
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		//Change a number (index, valueà
		numbers.set(2, Integer.valueOf(9));
		System.out.println(numbers.toString());

		//Ordering again
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers.toString());
		
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers.toString());
		
		System.out.println(numbers.size()); //5
		System.out.println(numbers.contains(Integer.valueOf(1))); //true
		System.out.println(numbers.isEmpty()); //false
		
		/**Loop for arraylist**/
		numbers.forEach(number -> {
			System.out.print(number *2+ " ");
		});
		
		System.out.print("\n" +numbers.toString()+"\n");
		
		/**replace/set**/
		System.out.println("Before : "+ numbers.toString() );
		numbers.forEach(number -> {
			numbers.set(numbers.indexOf(number), number *2);
		});
		System.out.println("After : " + numbers.toString());
	}
	
	
	

}
