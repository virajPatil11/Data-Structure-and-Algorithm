package Again;

public class SumOfallPrimeNum {
	public static void main(String[] args) {
		int n = 10;
		boolean prime[]  = new boolean[n+1];
		for(int i = 0;i <=n; i++) {
			prime[i] = true;
		}
		for(int p = 2; p*p <=n; p++) {
			if(prime[p] == true) {
				for(int i = p*p; i <= n;i += p) {
					prime[i] = false;
				}
			}
		}
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			if(prime[i] == true) {
				sum = sum + i;
				
			}
		}
		System.out.println(sum);
	}
}
