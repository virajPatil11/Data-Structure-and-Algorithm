package arrays;

import java.util.HashMap;

class majElem{
	
	static void findMaj(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if(count > arr.length/2) {
					System.out.println("Majority found:-" + arr[i]);
					return;
				}else
					map.put(arr[i], count);
			}
			else
				map.put(arr[i], 1);
		}
		System.out.println("No Majority element");
	}
}

public class majorityElement {
	public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,3,1};
        majElem m = new majElem();
        
        m.findMaj(arr);

	}
}
