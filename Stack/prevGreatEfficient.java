package stackk;
import java.util.Stack;
public class prevGreatEfficient {
	public static void main(String[] args) {
		int arr[] = {10, 4, 2, 20, 40, 12, 30};
		int n = arr.length;
		prevGrt(arr,n);
	}
	static void prevGrt(int arr[], int n) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[0]);
		
		for(int i = 1; i < n; i++) {
			
			while(s.empty() == false && s.peek() < arr[i]){
				s.pop();
			}
			if(s.empty() == true)
				System.out.print("-1, ");
			else
				System.out.print(s.peek() + ", ");
			s.push(arr[i]);
		}
	}
}
