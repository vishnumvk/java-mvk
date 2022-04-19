package oops_examples.inheritance;


class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}   
} 

class Employee {  
int id;  
String name;  
Address address;  
 // Employee HAS-A Address 
public Employee(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  

}  
public class Has_A {

	public static void main(String[] args) {
		
		Address address1=new Address("Avadi","Tamilnadu","India");  
		Address address2=new Address("Kadapa","AP","India");  
		  
		Employee e1=new Employee(111,"varun",address1);  
		Employee e2=new Employee(112,"arun",address2);  
		      
		e1.display();  
		e2.display();  
		      
	}

}
