package TestPrintGrade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3212.model.PrintGrade;

class TestGetLetterGrade {

	@Test
	void testGradeAUpperBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("A", grade.getLetterGrade(100));
		
		
	}
	@Test
	void testGradeALowerBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("A", grade.getLetterGrade(90));
		
	}
	@Test
	void testGradeCUpperBounadryB() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("B", grade.getLetterGrade(89));
		
	}
	@Test
	void testGradeBLowerBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("B", grade.getLetterGrade(80));
		
	}
	@Test
	void testGradeCUpperBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("C", grade.getLetterGrade(79));
		
	}
	@Test
	void testGradeCLowerBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("C", grade.getLetterGrade(70));
		
	}
	@Test
	void testGradeDUpperBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("D", grade.getLetterGrade(69));
		
	}
	@Test
	void testGradeDLowerBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("D", grade.getLetterGrade(60));
		
	}
	@Test
	void testGradeFUpperBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("F", grade.getLetterGrade(59));
		
	}
	@Test
	void testGradeFLowerBoundary() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("F", grade.getLetterGrade(0));
		
	}


}
