package hashmaps;

import java.util.HashMap;

public class ExHashMaps {
	public static void main(String[] arguments) {
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();
		//key-value
		
		
		//add, ordre aléatoire
		examScores.put("Math", 75);
		examScores.put("Sociology", 85);
		examScores.put("English", 95);
		examScores.put("Computer science", 95);
		examScores.put("Biology", 78);
		examScores.put("Math", 70); //Ici on écrasé la clé
		examScores.replace("Math", 10);//ici on la remplace
		
		examScores.putIfAbsent("Gym", 110);
		
		System.out.println(examScores.toString());
		
		//get by key
		System.out.println(examScores.get("Math"));
		System.out.println(examScores.getOrDefault("Religion", 50));
		
		//looking in hashmaps (all true)
		System.out.println(examScores.containsValue(110));
		System.out.println(examScores.containsValue(Integer.valueOf(110)));
		System.out.println(examScores.containsKey("Biology"));
		System.out.println(examScores.isEmpty()); //false
		
		
		//examScores.forEach(action);
		examScores.forEach((key, value) -> {
			//System.out.println(key+" : "+value);
			examScores.replace(key, value - 10);
			
		});
		System.out.println(examScores.toString());
		
		
		//remove
		examScores.remove("Sociology");
		System.out.println(examScores.toString());
		System.out.println(examScores.size());
		examScores.clear();
		System.out.println(examScores.size());
	}
}
