package searching;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int key = 7;
		int result = search(arr, 0, arr.length, key);
		if(result == -1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present at index : " + result);
		}
	}
	static int search(int arr[], int l , int r ,int key) {
		l = 0;
		r = arr.length -1;
		
		if(r >= l) {
			int mid = (l+r)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid] < key) {
				return search(arr, mid+1, r, key);
			}
			else {
				return search(arr, l, mid, key);
			}
			
		}
		return -1;
		
	}
}
