package usingoops;

import java.util.ArrayList;

public class University {
	private static String Name = "Vel Tech";
	Department cse = new Department("CSE");
	Department ece = new Department("ECE");
	Department eee = new Department("EEE");

	public static String getName() {
		return Name;
	}

	public static void main(String[] args) {
		University vel = new University();
		ArrayList<FacultyId> f = vel.cse.facultylist;
		f.add(new FacultyId("Ram", 111, "Avadi", "CSE", "JAVA"));
		f.add(new FacultyId("Arul", 112, "Delhi", "CSE", "OOPS"));
		f.add(new FacultyId("Arun", 113, "Coimbatore", "CSE", "OS"));
		ArrayList<StudentId> s = vel.cse.studentlist;
		s.add(new StudentId("Vishnu", 123, "kadapa", 6, "CSE"));
		s.add(new StudentId("Sai", 124, "Avadi", 1, "CSE"));
		s.add(new StudentId("Poojith", 125, "kadapa", 6, "CSE"));
		f = vel.ece.facultylist;
		f.add(new FacultyId("Kumar", 211, "Avadi", "ECE", "EMBEDDED SYSTEMS"));
		f.add(new FacultyId("Amar", 212, "Delhi", "ECE", "DIGITAL ELECTRONICS"));
		f.add(new FacultyId("Arjun", 213, "Coimbatore", "ECE", "ANALOG"));
		s = vel.ece.studentlist;
		s.add(new StudentId("Vishal", 133, "kadapa", 2, "ECE"));
		s.add(new StudentId("Shekar", 134, "Avadi", 1, "ECE"));
		s.add(new StudentId("Pavan", 135, "kadapa", 3, "ECE"));
		f = vel.eee.facultylist;
		f.add(new FacultyId("Kamal", 311, "Avadi", "EEE", "EMBEDDED SYSTEMS"));
		f.add(new FacultyId("Amar", 312, "Delhi", "EEE", "DIGITAL ELECTRONICS"));
		f.add(new FacultyId("Arjun", 313, "Coimbatore", "EEE", "ANALOG"));
		s = vel.eee.studentlist;
		s.add(new StudentId("Maruthi", 143, "Banglore", 2, "EEE"));
		s.add(new StudentId("Sarath", 144, "Ananthapurm", 4, "EEE"));
		s.add(new StudentId("Prem", 145, "Kurnool", 3, "EEE"));

		vel.cse.facultylist.get(0).showId();
		vel.cse.facultylist.get(0).printId();
		vel.cse.facultylist.get(0).printRecords();
		vel.cse.studentlist.get(0).showId();
		vel.cse.studentlist.get(0).printId();
		vel.cse.printRecords();

	}

}
