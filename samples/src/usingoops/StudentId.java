package usingoops;

public class StudentId extends Id implements IdPrinter {
	int sem;
	String dept;

	public StudentId(String name, int id_number, String address, int sem, String dept) {
		super(name, id_number, address);
		this.sem = sem;
		this.dept = dept;
	}

	@Override
	void showId() {

		System.out.printf(" Name    : %s\n ID      : %5d\n Address : %s\n", this.name, this.id_number, this.Address);

	}

	@Override
	public void printId() {
		printDline();
		System.out.printf("%s\n Name    : %s\n ID      : SI-%5d\n Dept    : %s\n Address : %s\n", University.getName(),this.name, this.id_number,
				this.dept, this.Address);
		printDline();
		

	}
	public String toString() {
		return this.name+"   "+this.id_number+"   "+this.sem+"   "+this.dept;
	}

	public static void main(String[] args) {
		StudentId s = new StudentId("vishnu", 123, "kadapa", 6, "EEE");
		s.showId();
		s.printId();
		
	}
}
