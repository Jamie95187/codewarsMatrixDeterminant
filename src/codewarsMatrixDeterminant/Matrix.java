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
		if(matrix[0].length == 1) {
			return matrix[0][0];
		} else if (matrix[0].length == 2) {
			return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
		}
		if(matrix[0].length == 3) {
			return matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2])) -
				   matrix[1][0] * ((matrix[0][1] * matrix[2][2]) - (matrix[2][1] * matrix[0][2])) +
				   matrix[2][0] * ((matrix[0][1] * matrix[1][2]) - (matrix[1][1] * matrix[0][2]));
		}
		return matrix[0][0] * (matrix[1][1] * (matrix[2][2] * matrix[3][3] - matrix[3][2] * matrix[2][3]) - 
							   matrix[2][1] * (matrix[1][2] * matrix[3][3] - matrix[3][2] * matrix[1][3]) +
							   matrix[3][1] * (matrix[1][2] * matrix[2][3] - matrix[2][2] * matrix[1][3]))
			- (matrix[1][0] * (matrix[0][1] * (matrix[2][2] * matrix[3][3] - matrix[3][2] * matrix[2][3]) -
							   matrix[2][1] * (matrix[0][2] * matrix[3][3] - matrix[3][2] * matrix[0][3]) +
							   matrix[3][1] * (matrix[0][2] * matrix[2][3] - matrix[2][2] * matrix[0][3])))
			+ (matrix[2][0] * (matrix[0][1] * (matrix[1][2] * matrix[3][3] - matrix[3][2] * matrix[1][3]) -
							   matrix[1][1] * (matrix[0][2] * matrix[3][3] - matrix[3][2] * matrix[0][3]) + 
							   matrix[3][1] * (matrix[0][2] * matrix[1][3] - matrix[1][2] * matrix[0][3])))
			- (matrix[3][0] * (matrix[0][1] * (matrix[1][2] * matrix[2][3] - matrix[2][2] * matrix[1][3]) -
							   matrix[1][1] * (matrix[0][2] * matrix[2][3] - matrix[2][2] * matrix[0][3]) +
							   matrix[2][1] * (matrix[0][2] * matrix[1][3] - matrix[1][2] * matrix[0][3]))
			  );

	}
	
}
