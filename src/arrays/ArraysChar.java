package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysChar {

	public static void main(String[] args) {
		char vowels[] = new char[5];
		char vowels2[] = {'a','e','i','o','u'};
		char reverseVowel[] = {'u','o','i','e','a'};

		
		vowels[0]= 'a';
		vowels[1]= 'e';
		vowels[2]= 'i';
		vowels[3]= 'o';
		vowels[4]= 'u';
		
		//Display array [a, e, i, o, u]
		System.out.println(Arrays.toString(vowels));
		System.out.println(Arrays.toString(vowels2));

		for (int i = 0; i < vowels.length; i++) {
			System.out.print(vowels[i]);
		}

		/**
		 * Method on Arrays
		 * */
		System.out.println("\n"+vowels.length);
		
		/**Sorting**/
		Arrays.sort(reverseVowel);
		System.out.println(Arrays.toString(reverseVowel));
		
		/**garder le debut et la fin ( de o à e) valeur length pas index*/
		//int startingIndex = 1;
		//int endIndex = 4;
		//Arrays.sort(reverseVowel, startingIndex, endIndex);
		//System.out.println(Arrays.toString(reverseVowel));
		

	}

}
