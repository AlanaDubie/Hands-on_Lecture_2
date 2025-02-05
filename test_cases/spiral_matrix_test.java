package test_cases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import src.spiral_matrix;

public class spiral_matrix_test {

    @Test
    public void testSpiralOrder() {
        spiral_matrix sm = new spiral_matrix();

        // Test case 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] expected1 = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(expected1, sm.spiralOrder(matrix1).stream().mapToInt(i -> i).toArray());

        // Test case 2: 4x4 matrix
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[] expected2 = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        assertArrayEquals(expected2, sm.spiralOrder(matrix2).stream().mapToInt(i -> i).toArray());

        // Test case 3: 1x1 matrix
        int[][] matrix3 = {{1}};
        int[] expected3 = {1};
        assertArrayEquals(expected3, sm.spiralOrder(matrix3).stream().mapToInt(i -> i).toArray());

        // Test case 4: 2x2 matrix
        int[][] matrix4 = {
            {1, 2},
            {3, 4}
        };
        int[] expected4 = {1, 2, 4, 3};
        assertArrayEquals(expected4, sm.spiralOrder(matrix4).stream().mapToInt(i -> i).toArray());
    }


}
