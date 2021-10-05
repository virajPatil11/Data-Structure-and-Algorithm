package learn;

public class pratice {
	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
	}
	public static int reverse(int x) {
		int sum = 0;
		int rev;
		
		while(x > 0 || x < 0) {
			
			rev = x % 10;
			x = x / 10;
			if(sum > Integer.MAX_VALUE/10) return 0;
			if(sum < Integer.MIN_VALUE/10) return 0;
			sum = (sum * 10) + rev;
			
		}
		return sum;
	}
}
