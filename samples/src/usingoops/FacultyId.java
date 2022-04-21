package usingoops;


public class FacultyId extends Id implements IdPrinter,RecordsPrinter {
	String dept;
	String subject;

	public FacultyId(String name, int id_number, String address, String dept, String subject) {
		super(name, id_number, address);
		this.dept = dept;
		this.subject = subject;
	}
    
	@Override
	void showId() {
		System.out.printf(" Name    : %s\n ID      : %5d\n Address : %s\n", this.name, this.id_number, this.Address);

	}

	@Override
	public void printId() {
		printDline();
		System.out.printf("%s\n Name    : %s\n ID      : FI-%5d\n Dept    : %s\n Address : %s\n", University.getName(),
				this.name, this.id_number, this.dept, this.Address);
		printDline();

	}
	public String toString() {
		return this.name+"   "+this.id_number+"   "+this.subject+"   "+this.dept;
	}

	@Override
	public void printRecords() {
		RecordsPrinter.border();
	
			System.out.println(this.name+"   "+this.id_number+"   "+this.Address+"   "+this.subject+"   "+this.dept);
	
		RecordsPrinter.border();
		
	}

}
