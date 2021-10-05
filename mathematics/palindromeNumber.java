package learn;

public class palindromeNumber {
	public static void main(String[] args) {
		int n = -121;
		System.out.println(check(n));
	}
	public static boolean check(int n) {
		int rem;
		int temp = n;
		int sum = 0;
		
		
		if(n < 0){
			return false;
		}
		
		while(n > 0 || n < 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if(temp == sum) {
			return true;
		}
		else {
			return false;
		}
	}
}
