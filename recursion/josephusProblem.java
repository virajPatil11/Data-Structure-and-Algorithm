package recusion;

public class josephusProblem {
	public static void main(String[] args) {
		int n = 7;
		int k = 4;
		System.out.println(findWinner(n, k));
	}
	public static int findWinner(int n , int k) {
		if(n == 0) {
			return n;
		}
		return (findWinner(n-1,k) + k) % n;
	}
}
