package recusion;

public class reverseString {
	public static void main(String[] args) {
		String input = "viraj";
		System.out.println(reverse(input));
	}
	public static String reverse(String input) {
		if(input.equals("")) {
			return "";
		}
		
		return reverse(input.substring(1)) + input.charAt(0);
		
	}
}
