package dsa;

public class gcdOfTwoNumber {
	public static void main(String[] args) {
		int n1 = 12,n2 = 24;
		int gcd = 1;
		for(int i = 1; i <= n1 && i <= n2 ; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
