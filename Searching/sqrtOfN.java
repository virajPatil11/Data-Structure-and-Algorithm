package searching;

public class sqrtOfN {
	public static void main(String[] args) {
		int x = 11;
		System.out.println(sqrt(x));
	}
	static int sqrt(int x) {
		if(x==0) return 0;
		int start = 1, end = x, ans = 0;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(mid <= x/mid) {
				ans = mid;
				start = mid+1;
			}
			else {
				end = mid - 1;
			}
		}
		return ans;
	}
}
