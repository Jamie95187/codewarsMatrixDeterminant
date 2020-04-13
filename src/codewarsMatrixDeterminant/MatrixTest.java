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
	public void determinantTest_2x2Matrix_singleElement() {
		int[][] matrix = {{1,1},{1,1}};
		assertEquals(0, Matrix.determinant(matrix));
		int[][] matrix2 = {{1,2},{3,4}};
		assertEquals(-2, Matrix.determinant(matrix2));
	}
	
	@Test
	public void determinantTest_3x3Matrix_singleElement() {
		int[][] matrix = {{1,1,1},{1,0,1},{0,0,0}};
		assertEquals(0, Matrix.determinant(matrix));
		int[][] matrix2 = {{2,1,3},{1,2,4},{3,1,1}};
		assertEquals(-6, Matrix.determinant(matrix2));
	}

}
