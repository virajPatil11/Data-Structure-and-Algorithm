package stackk;
import java.util.Arrays;
import java.util.Stack;
public class stockSpanEfficient {
	public static void main(String[] args) {
		int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
 
        cal(price, n, S);
 
        printArray(S);
	}
	static void cal(int price[], int n, int S[]) {
		Stack<Integer> s = new Stack<>();
		s.push(0);
		S[0] = 1;
		
		for(int i = 0; i < n; i++) {
			while(!s.empty() && price[i] >= price[s.peek()])
				s.pop();
			
			S[i] = (s.empty()) ? (i+1):(i - s.peek());
			s.push(i);
		}
	}
	
	static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
}
