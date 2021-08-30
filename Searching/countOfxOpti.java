package searching;

public class countOfxOpti {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3};
		int n = arr.length;
		int x = 2;
		System.out.println(first(arr, 0, arr.length-1, x, n));
		System.out.println(last(arr,0,arr.length-1,x,n));
		System.out.println(countt(arr, x, n));
	}
	static int first(int arr[], int l, int h, int x,int n) {
		if(h >= l) {
			int mid = (l+h)/2;
			
			if((mid==0 || x > arr[mid-1]) && arr[mid] == x) {
				return mid;
			}
			else if(x > arr[mid]) {
				return first(arr,(mid+1),h,x,n);
			}
			else {
				return first(arr,l,(mid-1),x,n);
			}
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
	
	public static int countt(int arr[], int x,int n) {
		int i;
		int j;
		
		i = first(arr, 0, n-1, x, n);
		
		if(i==-1)
			return i;
		
		j = last(arr, i, n-1, x, n);
		
		return j-i+1;
	}
}
