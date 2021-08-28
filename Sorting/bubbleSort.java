package sort;

class Bubble{
	void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void printArray(int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class bubbleSort {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		Bubble b = new Bubble();
		b.bubbleSort(arr);
		b.printArray(arr);
	}
}
