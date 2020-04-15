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

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {
	
	@Test
	public void determinantTest_1x1Matrix_singleElement() {
		int[][] matrix = {{1}};
		assertEquals(1, Matrix.determinant(matrix));
		int[][] matrix2 = {{2}};
		assertEquals(2, Matrix.determinant(matrix2));
	}
	
	@Test
	public void determinantTest_2x2Matrix_correctDeterminant() {
		int[][] matrix = {{1,1},{1,1}};
		assertEquals(0, Matrix.determinant(matrix));
		int[][] matrix2 = {{1,2},{3,4}};
		assertEquals(-2, Matrix.determinant(matrix2));
	}
	
	@Test
	public void determinantTest_3x3Matrix_correctDeterminant() {
		int[][] matrix = {{1,1,1},{1,0,1},{0,0,0}};
		assertEquals(0, Matrix.determinant(matrix));
		int[][] matrix2 = {{2,1,3},{1,2,4},{3,1,1}};
		assertEquals(-8, Matrix.determinant(matrix2));
		int[][] matrix3 = {{3,2,9},{2,4,4},{6,3,6}};
		assertEquals(-102, Matrix.determinant(matrix3));
	}
	
	@Test
	public void determinantTest_4x4Matrix_correctDeterminant() {
		int[][] matrix = {{1,1,1,1},{1,2,1,4},{1,2,3,3},{2,3,1,3}};
		assertEquals(-5, Matrix.determinant(matrix));
	}

	@Test
	public void determinantTest_9x9Matrix_correctDeterminant() {
		int[][] matrix = {
			{2, 7, 8, 6, 5, 3, 3, 5, 7},
			{0, 7, 6, 4, 5, 6, 7, 8, 5},
			{5, 8, 5, 8, 6, 8, 6, 8, 8},
			{1, 4, 6, 3, 2, 4, 6, 8, 6},
			{5, 3, 4, 6, 7, 9, 0, 7, 5},
			{4, 5, 6, 7, 5, 3, 2, 3, 5},
			{8, 9, 6, 3, 2, 3, 4, 2, 5},
			{2, 2, 2, 5, 6, 3, 8, 1, 2},
			{2, 9, 7, 5, 3, 2, 1, 1, 2}
		};
		assertEquals(813888, Matrix.determinant(matrix));
	}
}
