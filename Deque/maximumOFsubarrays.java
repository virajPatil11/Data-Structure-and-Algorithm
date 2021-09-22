package dequeue;

public class maximumOFsubarrays {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;
		int n = arr.length;
		find(arr,k,n);

	}
	static void find(int arr[], int k,int n) {
		
	
		int j, max;
		 
        for (int i = 0; i <= n - k; i++) {
 
            max = arr[i];
 
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }    
	}
}
	
