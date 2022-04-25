package more_oops.inheritance;
//                  Id
//                /    \
//               /      \
//              /        \
//       StudentId     FacultyId
class Id {
	protected String name;
	protected int id_number;
	protected String Address;

	public Id(String name, int id_number, String address) {
		super();
		this.name = name;
		this.id_number = id_number;
		Address = address;
	}

	public void showId() {

		System.out.printf(" Name    : %s\n ID      : %5d\n Address : %s\n", this.name, this.id_number, this.Address);

	}

}

class StudentId extends Id {
	int sem;
	String dept;
	String college;

	public StudentId(String name, int id_number, String address, int sem, String dept, String college) {
		super(name, id_number, address);
		this.sem = sem;
		this.dept = dept;
		this.college = college;
	}

	public void showId() {

		System.out.printf("%s\n Name    : %s\n ID      : SI-%5d\n Dept    : %s\n Address : %s\n", this.college,
				this.name, this.id_number, this.dept, this.Address);
	}
}

class FacultyId extends Id {
	String dept;
	String subject;
	String college;

	public FacultyId(String name, int id_number, String address, String dept, String subject, String college) {
		super(name, id_number, address);
		this.dept = dept;
		this.subject = subject;
		this.college = college;

	}

	public void showId() {
		System.out.printf("%s\n Name    : %s\n ID      : FI-%5d\n Dept    : %s\n Address : %s\n", this.college,
				this.name, this.id_number, this.dept, this.Address);
	}

}

public class Hierarchical {

	public static void main(String[] args) {
                FacultyId f = new FacultyId("Ram", 111, "Avadi", "CSE", "JAVA","veltech");
                f.showId();
                StudentId s = new StudentId("Vishnu", 123, "kadapa", 6, "CSE","veltech");
                s.showId();
	}

}
