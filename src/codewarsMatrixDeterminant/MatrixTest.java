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

}
