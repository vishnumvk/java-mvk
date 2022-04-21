package usingoops;

import java.util.ArrayList;

public class Department implements RecordsPrinter{
	String dept_name;
	ArrayList<FacultyId> facultylist = new ArrayList<>();
	ArrayList<StudentId> studentlist = new ArrayList<>();
    public ArrayList<FacultyId> getFacultylist() {
    	return this.facultylist;
    }
	public Department(String dept_name) {
		
		this.dept_name = dept_name;
	}
	@Override
	public void printRecords() {
		RecordsPrinter.border();
		System.out.println(" Faculty Records :");
		for(FacultyId f : this.facultylist) {
			System.out.println(f);
		}
		RecordsPrinter.border();
		System.out.println(" Student Records :");
		for(StudentId f : this.studentlist) {
			System.out.println(f);
		}
		RecordsPrinter.border();
	}
}
