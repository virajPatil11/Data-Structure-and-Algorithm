package arrays;

public class checkForkey {
	public static void main(String[] args) {
		int arr[] = {1,5,2,4,9,1,7,11,12,9,3};
		int x = 3;
		int k =3;
		int n = arr.length;
		if(find(n, arr, x, k)) {
			System.out.println("YEs");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static boolean find(int N, int[] arr, int x , int k) {
		int i;
		boolean b = false;
		int j = 0;
		for(i = 0; i < N;i = i + k) {
			for(j = i; j < i+k; j++) {
				if(j < N && arr[j] == x) {
					break;
				}
				if(j == i+k || j > N) {
					return false;
				}
			}
		}
		
		if(j < N) {
			return true;
		}
		return b;
		
	}
}
