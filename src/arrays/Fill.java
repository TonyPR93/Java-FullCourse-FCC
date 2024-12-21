package arrays;

import java.util.Arrays;

public class Fill {
	public static void main(String[] arguments) {
		char vowels[] = {'a','e','i','o','u'};
		
		/**
		 * Arrays.fill
		 * */
		
		//De A à U (Exclusif) => [a, x, x, x, u]
		int startingIndex = 1;
		int endIndex = 4;
		
		//Arrays.fill(vowels, 'x'); // [X, X, X, X, X]
		Arrays.fill(vowels, startingIndex, endIndex, 'x');
		
		System.out.println(Arrays.toString(vowels));
		
		
		/**
		 * Les arrays quand assignées passent une reference et pas une 'copie', si on chnage l'original ca changera celle qui la recoivent
		 * */
		int numbers[] = {1,2,3,4,5};
		int copyOfNumbers[] = numbers;
		
		/*Arrays.fill sur reference*/
		//Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copyOfNumbers));
		
		/*Pour faire de veritable copie*/ 
		
		//int copyOfNumbers2[] = Arrays.copyOf(numbers, numbers.length); // [1,2,3,4,5]
		//int copyOfNumbers2[] = Arrays.copyOf(numbers, 10); // [1,2,3,4,5,0,0,0,0,0]
		//int copyOfNumbers2[] = Arrays.copyOf(numbers, 2); // [1,2]
		//int copyOfNumbers2[] = Arrays.copyOfRange(numbers, startingIndex, endIndex); // [2,3,4]
		int copyOfNumbers2[] = Arrays.copyOfRange(numbers, startingIndex, 10); // [2,3,4,5,0,0,0,0,0]
		
		System.out.println(Arrays.toString(copyOfNumbers2));
		
		/*Logic on arrays*/
		int copyOfNumbers3[] = Arrays.copyOf(numbers, numbers.length);
		System.out.println(copyOfNumbers3 == numbers); //False -> Car ils comparents les références 
		System.out.println(copyOfNumbers3.equals(numbers));//False aussi ? -> Pas un simple object, il s'agit d'un array
		System.out.println(Arrays.equals(numbers, copyOfNumbers3));//True
		
	}
}
