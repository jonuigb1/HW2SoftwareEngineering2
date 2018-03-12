package TestPrintGrade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3212.model.PrintGrade;

class TestPrintGrade {

	@Test
	void testGradeA() {
		PrintGrade grade =  new PrintGrade();
		assertEquals("A", grade.getLetterGrade(99));
		
		
	}

}
