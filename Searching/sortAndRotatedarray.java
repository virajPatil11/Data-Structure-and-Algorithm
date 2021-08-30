package searching;

public class sortAndRotatedarray {
	public static void main(String[] args) {
		int arr[] = {20,30,40,50,60,5,10};
		int key = 10;
		System.out.println(search(arr,key));
	}
	
	static int search(int arr[],int key) {
		int l = 0;
		int h = arr.length -1;
		while(l <= h) {
			int mid = (l+h)/2;
			if(arr[mid] == key) return mid;
			
			if(arr[l] < arr[mid]) {
				if(key < arr[mid] && key >= arr[l]) {
					h = mid -1;
				}
				else {
					l = mid + 1;
				}
			}
			else {
				if(key > arr[mid] && key <= arr[h]) {
					l = mid + 1;
				}
				else {
					h = mid -1;
				}
			}
		}
		return -1;
	}
}
