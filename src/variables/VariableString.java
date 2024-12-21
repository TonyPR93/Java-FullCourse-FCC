package variables;

public class VariableString {
	public static void main(String[] arguments) {
		String literalString1 = "abc";
		String literalString2 = "abc";
		
		String objectString1 = new String("xyz");
		String objectString2 = new String("xyz");
		String objectString3 = new String("XYZ");
		
		// TRUE
		System.out.println(literalString1 == literalString2);
		
		//Ici on renvoie les références d'objets -> FALSE
		System.out.println(objectString1 == objectString2);
		
		//On fait comme ceci pour comparer des objects --> TRUE
		System.out.println(objectString1.equals(objectString2));
		System.out.println(objectString1.equalsIgnoreCase(objectString3));
		
		/**
		 * Formatted String
		 * 
		 * %s = String
		 * %d = int
		 * %f = double/float
		 * %c = char
		 * %b = Boolean
		 **/
		
		System.out.println("Hello World! I'm Panont Anthony and I'm 31, I'm redoing my java course to remember it all his details");
		
		String name = "Panont Anthony";
		int age = 31;
		String language = "java";
		String intro = "Hello World!";
		System.out.println( intro + " I'm "+ name +" and I'm "+age+", I'm redoing my "+ language + " course to remember it all his details");
		

		String formatedString = String.format("%s I'm %s and I'm %d, I'm redoing my %s course to remember it all his details", intro, name, age ,language);
		System.out.println(formatedString);
		
		/**
		 * Methods on String
		 * */
		
		String empty =" ";
		System.out.println(name.length()); //14
		System.out.println(name.isEmpty()); //false
		System.out.println(empty.isEmpty()); //false for more serious check -> isBlank (whitespace insensitive) 
		System.out.println(empty.isBlank()); //true for more serious check -> isBlank (whitespace insensitive) 
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String normalString = "The sky is blue";
		String modifiedString = normalString.replace("blue", "red");
		String modifiedString2 = normalString.replace('e', 'a');
		System.out.println(normalString);
		System.out.println(modifiedString);
		System.out.println(modifiedString2);
		
		System.out.println(normalString.contains("sky")); // true
		
		
	}
}
