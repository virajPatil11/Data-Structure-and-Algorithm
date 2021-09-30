package Heap;

import java.util.PriorityQueue;

public class NRopes {
	public static void main(String[] args) {
		int a[] = {2,5,4,8,6,9};
		
		System.out.println(minCost(a));
	}
	static int minCost(int a[]) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i = 0; i < a.length; i++) {
			q.add(a[i]);
		}
		int ans = 0;
		
		while(q.size() > 1) {
			int first = q.poll();
			int second = q.poll();
			
			int sum = first + second;
			ans += sum;
			q.add(sum);
		}
		return ans;
	}
}
