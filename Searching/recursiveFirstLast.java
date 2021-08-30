package searching;

public class recursiveFirstLast {
	public static void main(String[] args) {
		int arr[] = {1,3,5,5,6,6,7};
		int x = 6;
		int n = arr.length;
		System.out.println("First Occurence = " + first(arr,0,n-1,x,n));
		System.out.println("Second Occurence = " + last(arr,0,n-1,x,n));
	}
	public static int first(int arr[], int low, int high, int x, int n)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }
	public static int last(int arr[], int low, int high, int x, int n)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid - 1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }

 
}
