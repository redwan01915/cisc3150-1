public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("madamimadam"));
		System.out.println(isPalindrome("sahdfgj"));
	}

	public static boolean isPalindrome(String s) {

		// Comparing each character of opposite ends
		// Probably made it more complicated than it should have been
		
		for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {
			if ( s.charAt(i) != s.charAt(j) ) {
				return false;
			}
		}

		return true;
	}	
}