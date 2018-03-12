package edu.westga.cs3212.model;

import java.util.ArrayList;

public class PrintGrade {
	
	
	public String getPlusOrMinus(int grade) {
		String finalGrade = " ";
		
		if(grade<= 52) {
			finalGrade = grade + " ";
		}
		else if(grade == 100) {
			finalGrade = "+" + grade;
		}
		else if(grade% 10 >=7) {
			finalGrade = " +" + grade;
		}
		else if(grade% 10 <=2) {
			finalGrade = "-" + grade;
		}
		return finalGrade;
	}
	
	
	

}
