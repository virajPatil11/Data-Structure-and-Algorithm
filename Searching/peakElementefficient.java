package searching;

public class peakElementefficient {
	public static void main(String[] args) {
		int arr[] = {5, 10, 20, 15};
		int n = arr.length;
		System.out.println(find(arr, 1, n-1,n));
	}
	static int find(int arr[], int l, int h,int n) {
		
		//divide and conquer
		
		int mid = (l+h)/2;
		if(arr[mid] < arr[mid - 1]) {
			return find(arr, 0, (mid -1),n);
		}
		else if(arr[mid] < arr[mid+1]) {
			return find(arr,(mid+1),n,n);
		}
		else {
			return mid;
		}
	}
}
