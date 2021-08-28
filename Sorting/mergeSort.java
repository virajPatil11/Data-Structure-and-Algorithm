package sort;

public class mergeSort {
	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		mergesort(arr,0,arr.length-1);
		merge(arr,0,mid,r);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static void mergesort(int arr[], int l , int r) {
		if(l < r) {
			
			int mid = (l+r)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,0,l,mid,r);
		}
	}
	
	static int merge(int arr[], int l,int mid, int r) {
		int i= l;
		int j = mid+1;
		int k = l;
		
		while(i<= mid && j<=r) {
			if(arr[i] < arr[j]) {
				arr[k]= arr[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr[j];
				j++;
				k++;
			}
		}
		if(i>mid) {
			while(j<=r) {
				arr[k++] = arr[j++];
				
			}
		}
		else {
			while(i<=mid) {
				arr[k++] = arr[i++];
			}
		}
		return k;
	}
}
