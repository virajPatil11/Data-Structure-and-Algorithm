package searching;

public class countOf1sRecur {
	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 0, 0, 0, 0};
		int n = arr.length;
		System.out.println("count of 1's in given array is: " + countt(arr, 0, n-1));
	}
	public static int countt(int arr[],int l, int h) {
		if(h >= l){
			int mid= (l+h)/2;
			
			if((mid==h || arr[mid+1] == 0) && (arr[mid]==1)) 
				return mid+1;
			if(arr[mid] == 1)
				return countt(arr,(mid+1),h);
			else
				return countt(arr,l,(mid-1));
		}
		return -1;
	}
}
