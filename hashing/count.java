package hashing;

import java.util.Arrays;

public class count {
    static int countDistinct(int arr[], int n)
    {
        Arrays.sort(arr);
 
        int res = 0;
        for (int i = 0; i < n; i++)
        {
 
            while (i < n - 1 &&
                    arr[i] == arr[i + 1])
            {
                i++;
            }
            res++;
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        int arr[] = {4,3,1,2,3,4};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }
}
