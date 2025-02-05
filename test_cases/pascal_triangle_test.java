package test_cases;

import static org.junit.Assert.*;  // Import JUnit assertions
import org.junit.Test;
import java.util.*;
import src.pascal_triangle; // Replace with the actual package name

public class pascal_triangle_test {
    
    @Test
    public void testGenerate() {
        pascal_triangle pt = new pascal_triangle();

        // Test case 1: numRows = 5
        List<List<Integer>> expected1 = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(1, 1),
            Arrays.asList(1, 2, 1),
            Arrays.asList(1, 3, 3, 1),
            Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected1, pt.generate(5));

        // Test case 2: numRows = 0 (should return empty list)
        List<List<Integer>> expected2 = new ArrayList<>();
        assertEquals(expected2, pt.generate(0));

        // Test case 3: numRows = 1 (only one row)
        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(1));
        assertEquals(expected3, pt.generate(1));

        // Test case 4: numRows = 2
        List<List<Integer>> expected4 = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(1, 1)
        );
        assertEquals(expected4, pt.generate(2));
    }
}
