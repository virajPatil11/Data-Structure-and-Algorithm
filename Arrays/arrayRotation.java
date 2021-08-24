package arrays;

class RotateArray{
	
	void leftRotate(int arr[], int d, int n) {
		for(int i = 0; i < d ; i++) {
			leftRotatebyOne(arr,n);
		}
	}
	
	void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for(i = 0; i < n-1; i++)
			arr[i] = arr[i+1];
		arr[n-1] = temp;
	}
	
	void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}



public class arrayRotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		
		RotateArray a = new RotateArray();
		a.leftRotate(arr, d, n);
		a.printArray(arr, n);
	}
}
