package sort;

class Insertion{
	void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	void printArray(int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class insertionSort {
	public static void main(String[] args) {
		int arr[] = {8,4,1,5,9,2};
		Insertion i = new Insertion();
		i.insertionSort(arr);
		i.printArray(arr);
	}
}
