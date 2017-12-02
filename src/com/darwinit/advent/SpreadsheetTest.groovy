package com.darwinit.advent

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class SpreadsheetTest {

	@Test
	void GivenOneLineExpectedHaveTheDifferenceOfExtremas() {
		Spreadsheet sheet=new Spreadsheet();
		sheet.add("5 1 9 5");
		assertEquals(8, sheet.compute());
	}

	@Test
	void GivenOneLine753ExpectedHaveTheDifferenceOfExtremas4() {
		Spreadsheet sheet=new Spreadsheet();
		sheet.add("7    5    3");
		assertEquals(4, sheet.compute());
	}

	@Test
	void GivenOneLine2468ExpectedHaveTheDifferenceOfExtremas6() {
		Spreadsheet sheet=new Spreadsheet();
		sheet.add("2    4    6 8");
		assertEquals(6, sheet.compute());
	}

	@Test
	void GivenThreeLines_5195_753_2468ExpectedHaveTheSumofDifferenceOfExtremas18() {
		Spreadsheet sheet=new Spreadsheet();
		sheet.add("5 1 9 5");
		sheet.add("7    5    3");
		sheet.add("2    4    6 8");
		assertEquals(18, sheet.compute());
	}
}
