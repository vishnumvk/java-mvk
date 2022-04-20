package oops_examples.inheritance;

import java.util.*;

//create class for Office  
class Office {
	// declare variables for name and address
	public String name;
	public String address;

	// initialize name and address variables using constructor
	Office(String name, String address) {
		this.name = name;
		this.address = address;
	}
}

//Create a class for Company that has more than one Office.     
class Company {
	// declare variable for company name
	public String name;
	// declare a list of OfficeOffice that a Company has
	private final List< Office >offices;

	// initialize variable and list using constructor
	Company(String name, List<Office> offices) {
		this.name = name;
		this.offices = offices;
	}

	// create a getter function to return a list of office
	public List<Office> getTotalOfficesOfCompany() {
		return offices;
	}
}
  

// A Company without Offices cannot exist. 
// In this example Company has only one constructor that takes name and list of offices.
class Composition {
	
	
	public static void main(String[] args) {
		// create objects of Office class.
		Office o1 = new Office("Zoho Corporation", "Guduvanchery, India");
		Office o2 = new Office("Zoho Corporation", "Renigunta, India");
		Office o3 = new Office("Zoho Corporation", "Tenkasi, India");
		// create list which contains the no. of offices
		List<Office> offices = new ArrayList<Office>();
		offices.add(o1);
		offices.add(o2);
		offices.add(o3);
		
		// create an instance of the Company class by passing a list of Office to the
		// constructor
		Company company = new Company("Zoho", offices);
		System.out.println(company.name + " offices:");
		// get total offices of the Company using getter
		List<Office> data = company.getTotalOfficesOfCompany();
		// iterate offices of the company
		for (Office office : data) {
			// print data
			System.out.println("Name : " + office.name + "  " + " Address : " + office.address);
		}
		Company company2 = new Company("Zoho", null);
	}
}