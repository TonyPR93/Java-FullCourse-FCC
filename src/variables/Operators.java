package variables;

public class Operators {
	public static void main(String[] arguments) {
		int num1 = 12;
		int num2 = 6;
		
		/**Arithméthique**/
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // if divide an integer by an integer = interger else double
		System.out.println(num1 % num2); // Modulo
		System.out.println(num1++); // Att ++num1;
		System.out.println(num1--); 
		
		/**Comparaison**/
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		/**Assignement**/
		int x,y=0;
		
		x=num1;
		//x += num1;
		//x -= num1;
		//x *= num1;
		//x /= num1;
		//x %= num1;
		//x &= num1;
		//x |= num1; Calcul via binaire (OR)
		
		/*
		 * int x = 5;       // 5 en binaire : 0101
		 * x |= 3;          // 3 en binaire : 0011
         *        			// Résultat OR : 0111 (soit 7)
		 * */
		
		//x ^= num1;
		//x >>= num1; Decalage en bits
		
		/*
		 * int x=4 // 4en binaire = 0000 0100
		 * x <<=3  // on decale de 3 bits a gauche = 0010 0000 (32) ca fait exposant +-
		 * */
		
		//x <<= num1;
		System.out.println(x);
		x=y;
		
		
		/**Logical**/
		// && AND
		// || OR
		// !  NOT
		System.out.println(x<num1 && num1>num2); // les deux doivents etre true
		System.out.println(x<num1 || num1>num2); // un doit etre true
		System.out.println(!(x>num1)); // retourne l'inverse
		
		
		
	}
}
