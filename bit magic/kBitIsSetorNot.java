package bitwise;

public class kBitIsSetorNot {
	public static void main(String[] args) {
		int n = 6;
		int k = 3;
		//checkSetorNot(n, k);
		check(n,k);
	}
	//left shift
	public static void checkSetorNot(int n,int k) {
		if(( n & (1 << (k - 1))) > 0) {
			System.out.println("SET");
		}
		else {
			System.out.println("NOT SET");
		}
	}
	//right shift
	public static void check(int n, int k) {
		if(( n >> (k-1)) & 1) {
			System.out.println("SET");
		}
		else {
			System.out.println("NOT SET");
		}
	}
}
