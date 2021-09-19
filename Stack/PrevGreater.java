package stackk;

import java.util.Arrays;

public class PrevGreater {
	public static void main(String[] args) {
		int arr[] = {10, 4, 2, 20, 40, 12, 30};
		int n = arr.length;
        int s[] = new int[n];

		prev(arr, s,n);
	}
	public static void prev(int arr[], int s[],int n) {
	    System.out.print("-1, ");

		for(int i = 1; i < arr.length; i++) {
			int j;
			for(j = i-1; j >= 0; j--) {
				if(arr[i] < arr[j]) {
					System.out.print(arr[j] + ", ");
					break;
				}
				
			}
			if (j == -1)
		        System.out.print("-1, ");
		}
		
	}
	
}
