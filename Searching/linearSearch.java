package searching;

public class linearSearch {
	public static void main(String[] args) {
		int arr[] = {3,2,4,1,5,6};
		int key = 5;
		search(arr, key);
		
	}
	static void search(int arr[] , int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Key Element is present at index: " + i);
			}
		}
	}
}
