package pkgGame;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
public class SudokuTest {
 
	@Test
	public void Sudoku_Test1() {

		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void Sudoku_Test2() {
	 
	  Assertions.assertThrows(Exception.class, () -> {
		  Sudoku s1 = new Sudoku(10);
	  });
	 
	}

	@Test
	public void getRegion_Test1() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void getRegion_Test2() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(0,2);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void Sudoku_test1()
	{
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test2()
	{
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test3()
	{
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 5, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 5, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test4()
	{
		int[][] puzzle = { 
				{ 55, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	
	
	@Test
	public void PartialSudoku_Test1()
	{
		//	This test will test a partial sudoku...  a zero in [0,0]...  everything else works
		//	but the first element in the puzzle is zero 
		
		int[][] puzzle = { { 0, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void PartialSudoku_Test2()
	{
		//	This test will test a partial sudoku...  
		//	Everything zero, but there's a duplciate value in the region (not row/column)
 
		
		int[][] puzzle = {
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void PartialSudoku_Test3()
	{
		//	This is a working solution, make sure it fails isPartiaSudoku()
		
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	 

	@Test
	public void TestRegionNbr()
	{
		Sudoku s1= null;
		
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		int [] Region5 = {4,2,3,7,9,1,8,5,6};
		
		try {
			 s1 = new Sudoku(puzzle);
		} catch (Exception e) {
			fail("Bad Sudoku");
		}
		
		assertTrue(Arrays.equals(Region5, s1.getRegion(5)));
		
	}
	@Test
	public void testValidValue() {
		try {
			int[][] puzzle = { { 0, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			s1.printPuzzle(puzzle);
			assertEquals(true,s1.isValidValue(0, 0, 1));
		}
		catch(Exception e) {
			fail("Bad Sudoku");
		}
		
	}
	@Test 
	public void testValidValue2() {
		try {
			int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(false,s1.isValidValue(0, 0, 1));
		}
		catch(Exception e) {
			fail("Bad Sudoku");
		}
	}
	@Test 
	public void testValidValue3() {
		try {
			int[][] puzzle = { { 1, 2, 3, 4 }, { 0, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(true,s1.isValidValue(0,1,3));
		}
		catch(Exception e) {
			fail("Bad Sudoku");
		}
	}
	@Test 
	public void testValidValue4() {
		try {
			int[][] puzzle = { { 1, 2, 0, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(false,s1.isValidValue(0,0,3));
		}
		catch(Exception e) {
			fail("Bad Sudoku");
		}
	}
	@Test 
	public void testValidValue5() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(false,s1.isValidValue(0,0,2));
		}
		catch(Exception e) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testgetRegionNbr() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(0,s1.getRegionNbr(0, 0));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testgetRegionNbr2() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(1,s1.getRegionNbr(0, 2));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testgetRegionNbr3() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(2,s1.getRegionNbr(2, 0));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testgetRegionNbr4() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			assertEquals(3,s1.getRegionNbr(2, 2));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleArray() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			s1.shuffleArray(s1.getRow(0));
			assertNotSame(new int[] {1,0,0,4},s1.getRow(0));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleArray2() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			s1.shuffleArray(s1.getRow(1));
			assertNotSame(new int[] {3,2,1,2},s1.getRow(1));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleArray3() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			s1.shuffleArray(s1.getRow(2));
			assertNotSame(new int[] {2,1,4,3},s1.getRow(2));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleArray4() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			Sudoku s1 = new Sudoku(puzzle);
			s1.shuffleArray(s1.getRow(3));
			assertNotSame(new int[] {4,3,2,1},s1.getRow(3));
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleRegion() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("ShuffleRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 0);
			 assertNotSame(new int[] {1,0,3,2},s1.getRegion(0));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleRegion2() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("ShuffleRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 1);
			 assertNotSame(new int[] {0,4,1,2},s1.getRegion(1));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleRegion3() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("ShuffleRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 2);
			 assertNotSame(new int[] {2,1,4,3},s1.getRegion(2));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testShuffleRegion4() {
		try {
			int[][] puzzle = { { 1, 0, 0, 4 }, { 3, 2, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("ShuffleRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 3);
			 assertNotSame(new int[] {4,3,2,1},s1.getRegion(3));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testSetRegion() {
		try {
			int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("SetRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 0);
			 assertNotSame(new int[] {0,0,0,0},s1.getRegion(0));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testSetRegion2() {
		try {
			int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("SetRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 1);
			 assertNotSame(new int[] {0,0,0,0},s1.getRegion(1));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testSetRegion3() {
		try {
			int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("SetRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 2);
			 assertNotSame(new int[] {0,0,0,0},s1.getRegion(2));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
	@Test
	public void testSetRegion4() {
		try {
			int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			 Sudoku s1 = new Sudoku(puzzle);
			 Method method = Sudoku.class.getDeclaredMethod("SetRegion", int.class);
			 method.setAccessible(true);
			 method.invoke(s1, 3);
			 assertNotSame(new int[] {0,0,0,0},s1.getRegion(3));
			
		}
		catch(Exception ex) {
			fail("Bad Sudoku");
		}
	}
}
