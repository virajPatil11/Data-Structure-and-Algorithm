package recusion;

public class sumNaturalNumber {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n <= 1) {
			return n;
		}
		else {
			return sum(n-1) + n;
		}
	}
}
