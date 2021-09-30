package Heap;

import java.util.PriorityQueue;

public class kthLargest {
	public static void main(String[] args) {
		int a[] = {20,10,60,30,50,40};
		int k = 3;
		System.out.println("kth Largest element is : " + kLargest(a, k));
	}
	
	public static int kLargest(int a[] , int k){
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i = 0; i < k; i++)
			q.add(a[i]);
		
		for(int i = k; i < a.length ; i++) {
			if(q.peek() < a[i]) {
				q.poll();
				q.add(a[i]);
			}
		}
		return q.peek();
		
		

	}
}
