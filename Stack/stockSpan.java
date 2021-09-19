package stackk;

import java.util.Arrays;

public class stockSpan {
	public static void main(String[] args) {
		int prices[] = {10,4,5,90,120,80};
		int n = prices.length;
		int S[] = new int[n];
		span(prices, S,n);
		printArray(S);
	}
	static void span(int prices[],int S[],int n) {
		for(int i = 0; i < prices.length; i++) {
			S[0] = 1;
			for(int j = i;j >= 0; j--) {
				if(prices[i] >= prices[j]) {
					S[i]++;
				}
				else {
					break;
				}
			}
		}
	}
	static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
}
