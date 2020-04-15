# Matrix Determinant (4 KYU)

Solving [this](https://www.codewars.com/kata/52a382ee44408cea2500074c/train/java) codewars challenge.

## Description

Write a function that accepts a square matrix (`N x N` 2D array) and returns the determinant of the matrix.

How to take the determinant of a matrix -- it is simplest to start with the smallest cases:

A 1x1 matrix `|a|` has determinant `a`.

A 2x2 matrix `[ [a, b], [c, d] ]` or

```
|a b|
|c d|
```
has determinant: `a*d - b*c`.

The determinant of an `n x n` sized matrix is calculated by reducing the problem to the calculation of the determinants of `n` matrices of`n-1 x n-1` size.

For the 3x3 case, `[ [a, b, c], [d, e, f], [g, h, i] ]` or

```
|a b c|
|d e f|
|g h i|
```

the determinant is: `a * det(a_minor) - b * det(b_minor) + c * det(c_minor)` where `det(a_minor)` refers to taking the determinant of the 2x2 matrix created by crossing out the row and column in which the element a occurs:

```
|- - -|
|- e f|
|- h i|
```

**Note** the alternation of signs.

The determinant of larger matrices are calculated analogously, e.g. if M is a 4x4 matrix with first row `[a, b, c, d]`, then:

`det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - d * det(d_minor)`

## Tests

Tested with Junit 4 in the Eclipse IDE.

```
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
	assertEquals(-8, Matrix.determinant(matrix2));
	int[][] matrix3 = {{3,2,9},{2,4,4},{6,3,6}};
	assertEquals(-102, Matrix.determinant(matrix3));
}

@Test
public void determinantTest_4x4Matrix_singleElement() {
	int[][] matrix = {{1,1,1,1},{1,2,1,4},{1,2,3,3},{2,3,1,3}};
	assertEquals(-5, Matrix.determinant(matrix));
}
```