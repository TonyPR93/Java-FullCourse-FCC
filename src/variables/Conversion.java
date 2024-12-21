package variables;

public class Conversion {
	public static void main(String[] arguments) {
		
		/**
		 * Comme ceci cela fonctionne car un double est plus grand qu'un integer 8byte>4byte ! 5 devient 5.0
		 * l'inverse ne fonctionne pas ! car il perd des données ! 8,63 => 8
		 * */
		int number1 = 5;
		double number2 = number1;
		
		System.out.println(number2);
		
		/**
		 * conversion possible comme ceci, il faut preciser le int
		 * */
		double number3 = 5.8;
		int number4 = (int)number1;
		
	}
}
