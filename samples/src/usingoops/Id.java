package usingoops;

public abstract class Id {
	protected String name;
	protected  int id_number;
	protected String Address;

	public Id(String name, int id_number, String address) {
		super();
		this.name = name;
		this.id_number = id_number;
		Address = address;
	}
    abstract void showId();

}
