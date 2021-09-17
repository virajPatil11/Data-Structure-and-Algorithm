package string;

public class palindromeCheck {
	public static void main(String[] args) {
		String input = "kayak";
		System.out.println(check(input));
	}
	static boolean check(String input) {
		if(input.length() == 0 || input.length() == 1) {
			return true;
			
		}
		else {
			if(input.charAt(0) != input.charAt(input.length()-1)) 
				return false;
			return check(input.substring(1,input.length()-1));
			
			
		}
	}
}
