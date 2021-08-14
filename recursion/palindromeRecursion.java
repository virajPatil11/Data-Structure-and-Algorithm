package recusion;

public class palindromeRecursion {
	public static void main(String[] args) {
		String input = "racecar";
		System.out.println(isPalindrome(input));
	}
	public static boolean isPalindrome(String input) {
		if(input.length() == 0 || input.length() == 1) {
			return true;
		}
		else {
			if(input.charAt(0) == input.charAt(input.length() - 1)) {
				return isPalindrome(input.substring(1,input.length() - 1 ));
			}
			else {
				return false;
			}
		}

	}
}
