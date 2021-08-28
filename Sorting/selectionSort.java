package sort;

class Selection{
	void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			int minn = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minn]) {
					minn = j;
				}
			}
			int temp = arr[minn];
            arr[minn] = arr[i];
            arr[i] = temp;
 
		}
	}
	void printArray(int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class selectionSort {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		Selection i = new Selection();
		i.selectionSort(arr);
		i.printArray(arr);
	}
}
