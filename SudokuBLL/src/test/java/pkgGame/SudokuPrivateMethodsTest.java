package pkgGame;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class SudokuPrivateMethodsTest {
	public SudokuPrivateMethodsTest() {
	}
	
	@Test
	public void FillDiagonalRegions() {
		int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		try {
		Sudoku sudoku = new Sudoku(puzzle);
		
		
		sudoku.FillDiagonalRegions();
		assertArrayEquals(new int[] {0, 0, 0, 0}, sudoku.getRegion(1));
		assertArrayEquals(new int[] {0, 0, 0, 0}, sudoku.getRegion(2));
		assertNotSame(new int[] {0, 0, 0, 0}, sudoku.getRegion(0));
		assertNotSame(new int[] {0, 0, 0, 0}, sudoku.getRegion(3));
		}
		catch(Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	/**
	 * Print starts prints stars
	 * 
	 * @author - zehezack
	 * 
	 */
	private void PrintStars() {
        for (int i = 0; i < 50; i++)
            System.out.print("*");
        System.out.println();
    }
	
	/**
	 * 
	 * Tests the print stars function
	 * 
	 * @author - zehezack
	 * 
	 */
    @Test
    public void PrintStarsTest() {
        try {
            PrintStars();
        } catch(Exception e) {
            fail("PrintStar failed for some reason");
        }
    }
    
    /**
     * 
     * Test Sudoku Set Region
     * 
     * @author - zehezack
     * 
     */
    @Test
    public void Sudoku_Test_SetRegion() {
        int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        int[][] ePuzzle = { { 0, 0, 1, 2 }, { 0, 0, 3, 4 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        try {
            Sudoku TS = new Sudoku(puzzle);
            java.lang.reflect.Method method = Sudoku.class.getDeclaredMethod("SetRegion", int.class);
            method.setAccessible(true);
            method.invoke(TS, 1);
            assertArrayEquals(TS.getPuzzle(), ePuzzle);
        } catch (Exception e) {
            fail("  ");
        }
    }
    
}
