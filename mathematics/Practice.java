package Again;
public class Practice {
	public static void main(String[] args) {
		int arr[]  = {0,1,0,0,3,12};
		
		int curr = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[curr] = arr[i];
				curr++; 
			}
		}
		for(int i = curr; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
