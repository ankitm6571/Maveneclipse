package com.infy;

class Grade{
	private char grades;
	public char calcualteGrade(String employeeID, int point){
		return grades;
	}
}
class Manager {                                               
	Grade grade = new Grade(){                                     //Represents anonymous inner class 
		private char grade;
	public char calculateGrade(String employeeID, int point){
		// calculate grade
		return grade;
	}
	};
	public char checkEmployeeID(String employeeId, int point) {                          
		return grade.calculateGrade(employeeid,point);
	}
}
