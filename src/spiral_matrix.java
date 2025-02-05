package src;

import java.util.List;
import java.util.ArrayList;

public class spiral_matrix {

    public List<Integer> spiralOrder(int[][] matrix)
    {
        int top = 0; // top pointer positioned at left column, top row 
        int bottom = matrix.length - 1; // bottom pointer positioned at bottom row, right column
        int left = 0; // left pointer positioned at left column, top row
        int right = matrix[0].length - 1; // right pointer positioned at right column, bottom row

        int direction = 0; // 0 = left to right, 1 = top to bottom, 2 = right to left, 3 = bottom to top

        // create a list to store the result
        List<Integer> result = new ArrayList<>();

        // loop through the matrix, end when pointers meet
        while (left <= right && top <= bottom)
        {
            switch (direction) 
            {
                case 0: // move right
                    // loop through top row
                    for (int i = left; i <= right; i++)
                    {
                        // add element to result list
                        result.add(matrix[top][i]);
                    }
                    top++; // move top pointer down
                    break;

                case 1: // move down
                    // loop through right column
                    for (int i = top; i <= bottom; i++)
                    {
                        result.add(matrix[i][right]);
                    }
                    right--; // move right pointer left
                    break;
                
                case 2: // move left
                    // loop through bottom row
                    for (int i = right; i >= left; i--)
                    {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--; // move bottom pointer up
                    break;

                case 3: // move up              
                    // loop through left column
                    for (int i = bottom; i >= top; i--)
                    {
                        result.add(matrix[i][left]);
                    }
                    left++; // move left pointer right
                    break;
            }
            // mod 4 to keep direction within 0-3
            direction = (direction + 1) % 4; 
        }
        return result;
    }

    public static void main(String[] args) {

        spiral_matrix test1 = new spiral_matrix();
        System.out.println(test1.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(test1.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }


}
