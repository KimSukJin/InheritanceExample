package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	private int facultyNumber;
	
	public Faculty(String initialName, int initialStudentNumber) {
		super(initialName);
		facultyNumber = initialStudentNumber;
	}

	public void reset(String newName, int newFacultyNumber) {
		setName(newName);
		facultyNumber = newFacultyNumber;
	}

	public int getFacultyNumber() {
		return facultyNumber;
	}
	
	public void setFacultyNumber(int newFacultyNumber) {
		facultyNumber = newFacultyNumber;
	}
	
	public void writeOutput() {
		//System.out.println("Name: " + getName());
		super.writeOutput();
		System.out.println("Student Number: " + facultyNumber); 
	}
	
	public boolean equals(Faculty otherFaculty) {
		return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
	}
}
