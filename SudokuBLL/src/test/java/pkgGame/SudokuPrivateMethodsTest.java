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
}
