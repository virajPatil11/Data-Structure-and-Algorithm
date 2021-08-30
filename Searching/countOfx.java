package searching;

public class countOfx {
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,3,3,4};
		int x = 3;
		System.out.println(countt(arr, x));
	}
	static int countt(int arr[],int x) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				count += 1;	
			}
		}
		return count;
	}
}
