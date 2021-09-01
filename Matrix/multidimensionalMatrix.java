package matrix;

import java.util.Scanner;

public class multidimensionalMatrix {
	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < mat.length; i++)
        {
  
            // If current row is even, print from
            // left to right
            if (i % 2 == 0)
            {
                for (int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] +" ");
  
  
            // If current row is odd, print from
            // right to left
            }
            else
            {
                for (int j = mat[0].length - 1; j >= 0; j--)
                    System.out.print(mat[i][j] +" ");
            }
        }
		
	}
	
}
