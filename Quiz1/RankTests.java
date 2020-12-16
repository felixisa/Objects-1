import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {

        double[] grades = {88.5, 39, 46, 100}; 
        int[] gradesRanked = RankGrades.rankGrades(grades); 
        int[] expected = {2, 4, 3, 1}; 

        assertArrayEquals(gradesRanked, expected); 
        
	}

}