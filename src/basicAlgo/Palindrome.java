package basicAlgo;

public class Palindrome {
	public boolean isPalindrome(int x) {
		String convertedInt =  Integer.toString(x);
		String reversedInt = reverse(convertedInt);
		
		System.out.println(convertedInt);
		System.out.println(reversedInt);
		
		if(reversedInt.equals(convertedInt)) {
			return true;
		}
		return false;	
	}
	
	private String reverse(String convertedInt) {
		char[] exploded = convertedInt.toCharArray();

		for(int i=0; i<convertedInt.length()/2; i++) {
	        char temp = exploded[i];
	        exploded[i] = exploded[exploded.length - 1 - i];
	        exploded[exploded.length - 1 - i] = temp;
		}
		
		//String reversed = exploded.toString(); return ref
		return new String(exploded);
	}

}
