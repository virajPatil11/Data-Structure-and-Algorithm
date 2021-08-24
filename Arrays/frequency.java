package arrays;

import java.util.HashMap;
import java.util.Map;

class Find{
	static void findFreq(int[] arr, int n) { 
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < n; i++) {
			if(!mp.containsKey(arr[i]))
				mp.put(arr[i], 0);
			
			mp.put(arr[i],mp.get(arr[i]) + 1);
		}
		
		for(Map.Entry<Integer, Integer> kvp: mp.entrySet()) {
			System.out.println("Element " + kvp.getKey() + " occurs " + kvp.getValue() + " times");
		}
	}
}



public class frequency {
	public static void main(String[] args) {
		int [] arr = {5,1,4,1,1};
		int n = arr.length;
		
		Find f = new Find();
		
		f.findFreq(arr,n);
	}

}
