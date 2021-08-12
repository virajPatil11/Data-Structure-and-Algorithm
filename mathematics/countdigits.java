package dsa;

public class countdigits {
	public static void main(String[] args) {
		int n = 1234;
		System.out.println(countDigits(n));
	}
	public static int countDigits(int n) {
		int count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		return count;
	}
}
 