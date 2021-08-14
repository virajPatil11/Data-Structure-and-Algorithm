package recusion;

public class nTo1Print {
	public static void main(String[] args) {
		int n = 5;
		printt(n);
	}
	
	public static int printt(int n) {
		if(n <= 0) {
			return n;
		}
		else {
			System.out.print(n + " ");
			return printt(n-1);
		}
	}
}
