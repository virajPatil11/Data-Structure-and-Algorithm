package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthSmallest {
	public static void main(String[] args) {
		int arr[] = {20,10,60,30,50,40};
		int k = 3;
		
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
}
