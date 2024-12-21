package variables;

public class Variables {
	/**
	 * Static method only accept static variables
	 * Le programme tourne normalement même si on declare pas Age, on lui assigne une valeur par defaut ici '0' et non null
	 **/
	static int age = 31;
	
	public static void main(String[] arguments) {
		System.out.println("I am " + age + " years old.");			
		typesOfVariables();
	}

	private static void typesOfVariables() {
		/**
		 * Primitive TYpe
		 **/
		
		/*Integer Types*/
		byte aSingleByte = 100; 				// - 128			/ 127					/1byte=8bits
		short smallNumber = 20000;				// - 32'768 		/ 32'767				/2byte
		int anInteger = 2147483647;				// - 2'147'483'648 	/ 2'147'483'647			/4byte
		long longNumber = 9223372036854775807L;	// L a la fin obligatoire !					/8byte
		
		/*decimal types*/
		double aDouble = 25.25; // 4.94065645841246544e-324 to 1.79769313486231570e+308		/8byte
		float aFloat = 4.4028F; // Ajoutez F a la fin 1.40239846e-45f to 3.40282347e+38f	/4byte
		
		//booleans
		boolean isWeekend = false;	//1byte
		boolean isWorkday = true;	//1byte
		
		//char
		char copyright = '\u00A9';
		char percent ='%';
		System.out.println(copyright + " " + percent); //0 ('\u0000') to 65535 ('\uffff') /2byte
		
		//String
		String name= "Panont";
		String stringClass = new String("Anthony");
		System.out.println(name + " " + stringClass);
		
		
	}
	

}
