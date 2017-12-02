package com.darwinit.advent

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class December02_Part2Test {

	@Test
	void GivenOneLine5928ExpectedHaveTheDivisionOfTwoMultipleNumbers() {
		def sheet=new Spreadsheet();
		sheet.add("5 9 2 8");
		// 8/2
		assertEquals(4, sheet.computeDivision());
	}
	
	@Test
	void GivenOneLine9473ExpectedHaveTheDivisionOfTwoMultipleNumbers() {
		def sheet=new Spreadsheet();
		sheet.add("9 4 7 3");
		// 9/3
		assertEquals(3, sheet.computeDivision());
	}
	
	@Test
	void GivenOneLine3865ExpectedHaveTheDivisionOfTwoMultipleNumbers() {
		def sheet=new Spreadsheet();
		sheet.add("3 8 6 5");
		// 6/3
		assertEquals(2, sheet.computeDivision());
	}	

}
