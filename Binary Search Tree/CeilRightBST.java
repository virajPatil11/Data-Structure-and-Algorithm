package BinaryTree;

import java.util.ArrayList;
import java.util.TreeSet;

public class CeilRightBST {
	public static void closetGreater(int[] arr) {
		int n = arr.length;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ArrayList<Integer> ceilings = new ArrayList<Integer>(n);
		
		for(int i = n-1; i >= 0; i--) {
			Integer greater = ts.ceiling(arr[i]);
			if(greater == null)
				ceilings.add(-1);
			else
				ceilings.add(greater);
			ts.add(arr[i]);
		}
		for(int i= n-1; i >= 0; i--) {
			System.out.print(ceilings.get(i) + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {50,20,200,100,30};
		closetGreater(arr);
	}
}
