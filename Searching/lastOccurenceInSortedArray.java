package searching;

public class lastOccurenceInSortedArray {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125};
		int result = find(arr, 5);
		if(result == -1) {
			System.out.println("Element is Not present");
		}
		else {
			System.out.println("Last Occurence = " + result);
		}

	}
	static int find(int arr[], int x) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
