package src;

import java.util.ArrayList;
import java.util.List;


public class pascal_triangle {

     // function to generate Pascal's Triangle, takes in an integer numRows
    public List<List<Integer>> generate (int numRows){

        // initalize 2D array list to store triangle 
        List<List<Integer>> triangle = new ArrayList<>();

        // loop through until numRows, starting at second row of triangle
        for (int i = 0; i < numRows; i++)
        { 
            // create a new array list to store each row
            List <Integer> row = new ArrayList<>(); 

            // loop through each row 
            for (int j = 0; j <= i; j++)
            {
                // Handling the edges of the triangle
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    // Sum of two elements from the previous row
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            // stores row into triangle array
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {

        pascal_triangle test1 = new pascal_triangle();
        System.out.println(test1.generate(5));
        System.out.println(test1.generate(0));
        System.out.println(test1.generate(1));
    }

}
