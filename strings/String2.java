package string;


public class String2 {
	public static void main(String[] args) {
		String input = "racecar";
		System.out.println(check(input));
	}
	static boolean check(String input) {
		if(input.length() == 0) {
			return true;
		}
		input = input.toLowerCase();
		for(int i = 0; i < input.length() / 2; i++) {
			char start = input.charAt(i);
			char end =  input.charAt(input.length() - 1 - i);
			
			if(start != end) {
				return false;
			}
			
		}
		return true;
	}
}

