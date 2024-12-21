package loops;

import java.util.Iterator;

public class For {
	public static void main(String[] arguments) {
		int number[]= {1,2,3,4,5,6,7,8,9,10};
		int number2=5;
		
		/**addition de tous les elements dans un array**/
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
			//System.out.println(number[i]);
		}
		System.out.println(sum);
		
		/**table de multipicationsimple**/
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n",number2,i, number2*i);	
		}
		
		/**Table de multiplicaion complete**/
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d | ", i, j, i*j);
			}
			System.out.println();
		}
		
		
		/**print odd**/
		for (int i = 0; i <= 10; i++) {
			if (i%2 == 1) {
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		sum=0;
		for (int i : number) {
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();
		System.out.println(sum);
	}
}
