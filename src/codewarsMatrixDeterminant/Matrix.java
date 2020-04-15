/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/52a382ee44408cea2500074c/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	13/04/2020
 */

package codewarsMatrixDeterminant;

public class Matrix {
	
	static int determinant(int[][] matrix) {
		return determinantOfMatrix(matrix, matrix.length);
	}
	
	// Method to get cofactor of mat[p[[q] in temp[][]
	// n is the current dimension of the mat[][]
	
	static void getCofactors(int[][] mat, int temp[][], int p, int q, int n) {
		int i = 0, j = 0;
		
		// Looping through the element of the matrix
		
		for (int row = 0; row < n; row++) {
			
			for (int col = 0; col < n; col++) {
				
				// Copying into temporary matrix
				// only those elements which are
				// not in given row and column
				
				if (row != p && col != q) {
					temp[i][j++] = mat[row][col];	
				
					// row is filled, so increase 
					// row index and reset col
					// index
					if (j == n - 1) {
						j = 0;
						i++;
					}
				}
			}
		}
	}
	
	// recursive method to find determinant where n is the current dimension of the matrix
	// mat[][]
	
	static int determinantOfMatrix(int[][] mat, int n) {
		int determinant = 0;
		
		// Base case when single element
		if (n == 1) {
			return mat[0][0];
		}
		
		// Store cofactors
		int temp[][] = new int[mat[0].length][mat[0].length];
		
		// sign multiplier
		int sign = 1;

		// iterate each element of the first row
		for (int f = 0; f < n; f++) {
			// getting cofactors of matrix [0][f]
			getCofactors(mat, temp, 0, f, n);
			determinant += sign * mat[0][f] 
					* determinantOfMatrix(temp, n - 1);
			
			// terms are to be added with alternate signs
			sign = -sign;
		}
		
		return determinant;
	}
	
	
	
}
