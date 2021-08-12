package dsa;

public class palindrome {
	public static void main(String[] args) {
		int n = 121;
		int rem;
		int temp = n;
		int sum = 0;
		while(n != 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if(temp == sum) {
			System.out.println("Palindrome NUmber");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
