package dsa;

public class buzzNumber {
	public static void main(String[] args) {
		// Buzz number 
		// if no. is divided by 7 or if remainder comes out to be 7 then it is buzz else not
		int n = 123;
		if(n % 7 == 7 || n % 7 == 0) {
			System.out.println("Buzz Number");
		}
		else {
			System.out.println("Not a Buzz Number");
		}
	}
}
