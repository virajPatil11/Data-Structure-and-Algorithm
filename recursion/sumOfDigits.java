package recusion;

public class sumOfDigits {
	public static void main(String[] args) {
		int n = 87;
		System.out.println(sumof(n));
	}
	public static int sumof(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return n % 10 + sumof(n/10);
		}
	}
}
