package arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] arguments) {
		char vowels[] = {'a','e','i','o','u'};

		/**BinarySearch**
		 * 
		 * Renvoie l'index ou se trouve l'element recherché 
		 * Si pas trouvé renvoie un négatif !
		 * 
		 * si false 
		 * */
		char key = 'b';
		
		//int startingIndex = 1;
		//int endIndex = 4;
		Arrays.sort(vowels);
		int foundItemIndex = Arrays.binarySearch(vowels, key);
		//int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endIndex ,key);
		
		System.out.println(Arrays.toString(vowels));
		System.out.println(foundItemIndex);
	}
}
