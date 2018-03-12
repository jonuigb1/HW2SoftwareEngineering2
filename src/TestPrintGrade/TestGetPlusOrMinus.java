package TestPrintGrade;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3212.model.PrintGrade;

class TestGetPlusOrMinus {

	@Test
	void testPostiveA() {
		PrintGrade grade = new PrintGrade();
		assertEquals("+", grade.getPlusOrMinus(100));
		
	}
	@Test
	void testNegativeAUpperBoundary() {
		PrintGrade grade = new PrintGrade();
		assertEquals("-", grade.getPlusOrMinus(92));
		
	}
	@Test
	void testNegativeALowerBoundary() {
		PrintGrade grade = new PrintGrade();
		assertEquals("-", grade.getPlusOrMinus(90));
		
	}
	@Test
	void testPostiveBUpperBoundary() {
		PrintGrade grade = new PrintGrade();
		assertEquals("+", grade.getPlusOrMinus(89));
		
	}
	@Test
	void testPostiveBLowerBoundary() {
		PrintGrade grade = new PrintGrade();
		assertEquals("-", grade.getPlusOrMinus(82));
		
	}
	@Test
	void testNegativeFLowerBoundary() {
		PrintGrade grade = new PrintGrade();
		assertEquals("-", grade.getPlusOrMinus(5));
		
	}


}
