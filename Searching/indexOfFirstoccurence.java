package searching;

public class indexOfFirstoccurence {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int result = find(arr, 5);
		if(result == -1) {
			System.out.println("Element is Not present");
		}
		else {
			System.out.println("First Occurence = " + result);
		}

	}
	static int find(int arr[], int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
