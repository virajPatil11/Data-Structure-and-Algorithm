package Again;
public class Practice {
	public static void main(String[] args) {
		
		
		int arr[] = {1,1,2,3,3,4,5,5};
		int n = arr.length;
		n = remove(arr, n);
		for(int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
		
	}
	static int remove(int arr[],int n) {
		if(n == 0 || n == 1)
			return n;
		
		int j = 0;
		for(int i = 0; i < arr.length - 1;i++) {
			if(arr[i] != arr[i+1])
				arr[j++] = arr[i];
		}
		arr[j++] = arr[n-1];
		return j;
	}
	
}
