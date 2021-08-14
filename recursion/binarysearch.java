package recusion;

public class binarySearch {
	public static void main(String[] args) {
		int A[] = {-1,0,1,2,3,4,7,9,10,20};
		int x = 10;
		int n = A.length;
		System.out.println(search(A, 0, n-1, x));
	}
	public static int search(int[] A, int l , int r, int x) {
		if(l > r) {
			return -1;
		}
		int mid = (l + r) / 2;
		if(x == A[mid]) {
			return mid;
		}
		else if(x > A[mid]) {
			return search(A,mid+1,r,x);
		}
		return search(A,l,mid-1,x);
	}
}
