package searching;

public class countOf1 {
	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1, 1, 1, 1};
		int count = 0;
		int x = 1;
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == x) 
				count += 1;
		System.out.println(count);
	}
}
