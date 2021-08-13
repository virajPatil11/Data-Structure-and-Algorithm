package bitwise;

public class powerOfTwoORNot {
	public static void main(String[] args) {
		int n = 8;
		if((n & (n-1)) == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
