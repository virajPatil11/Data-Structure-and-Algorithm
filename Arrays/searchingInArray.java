package arrays;

public class searchingInArray {
	public static void main(String[] args) {
		
		//Linear Search
		
		int arr[] = {2,4,1,6,8,3,9,5};
		int key = 6;
		System.out.println(searching(arr, key));
		
	}
	public static int searching(int arr[], int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		
		}
		return -1;
	}
}
