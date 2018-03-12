package edu.westga.cs3212.model;

import java.util.ArrayList;

public class PrintGrade {
	
	public String getLetterGrade(int grade) {
		String letterGrade = "";
		if(grade >=90) {
			letterGrade = "A";
		}
		else if( grade >= 80) {
			letterGrade = "B";
		}
		else if(grade >= 70) {
			letterGrade ="C";
		}
		else if(grade >=60) {
			letterGrade ="D";
		}
		else {
			letterGrade ="F";
		}
		return letterGrade;
	}
	
	
	public String getPlusOrMinus(int grade) {
		String finalGrade = "";
		
		if(grade<= 52) {
			finalGrade = "-";
		}
		else if(grade == 100) {
			finalGrade = "+" ;
		}
		else if(grade% 10 >=7) {
			finalGrade = "+";
		}
		else if(grade% 10 <=2) {
			finalGrade = "-";
		}
		return finalGrade;
	}
	
	
	

}
