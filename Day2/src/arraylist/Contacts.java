package arraylist;
import java.util.*;
class Contact{
	String name;
	long phonenumber;
	public Contact(String n,long p){
		this.name=n;
		this.phonenumber=p;
	}
	
	public String toString() {
		return "Name :"+name+"  phone number :"+phonenumber;
	}
	
}
public class Contacts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Contact> cl = new ArrayList <Contact>();
		
		 
		 String str;
		 int f=1;
		 while(f==1) {
		 System.out.println("Select mode (add/remove/exit/view/find):");
		 str = sc.next();
		 switch(str) {
		 case "add":
			System.out.println("Enter name :"); 
			String name=sc.next(); 
			System.out.println("Enter phone number :");
			long ph=sc.nextLong();
		    cl.add(new Contact(name,ph));
		    break;
		 case "remove":
			 if(cl.isEmpty()) {
				 System.out.println("No saved contacts, add new contacts");
				 break;
				 }
			 System.out.println("Enter contact name to remove");
			 str=sc.next();
			 try {
				 int found =0;
				 for(int i=0;i<cl.size();i++){
						Contact c=cl.get(i);
						if(str.equalsIgnoreCase(c.name)) {
						cl.remove(c);
						System.out.println("removed "+str+" successfully");
						found =1;
						break;
						}
					}
				 if(found==0) {
					 System.out.println("No contact found with name "+str);
				 }
			 
			 }
			 catch(Exception e){
				 System.out.println("contact not found"+e);
			 }
			 break;
		 case "exit":
			 System.out.println("Exiting ...");
			 f=0;
			 break;
		 case "view":
			 if(cl.isEmpty()) {
				 System.out.println("No saved contacts, add new contacts");
				 break;
				 }
			 displayContacts(cl);
			 break;
		 case "find":
			 if(cl.isEmpty()) {
				 System.out.println("No saved contacts, add new contacts");
				 break;
				 }
			 System.out.println("Enter name to find contact :");
			 getNumber(sc.next(),cl);
			 break;
		 default :
			 System.out.println("Please select suggested mode");
		 }
		 
		 }
		 sc.close();
		
	}
	public static void displayContacts(List <Contact> a) {
		try {
			for(Contact c : a){
				System.out.println(c.toString());
			}
		}
		catch(Exception e) {
			System.out.println("No contacts found");
		}
	}
	
	public static void getNumber(String ns,List <Contact> a) {
		try {
			int f =0;
			for(Contact c : a){
				
				if(ns.equalsIgnoreCase(c.name)) {
				System.out.println(c.toString());
				f=1;
				}
			}
			if(f!=1) {
				System.out.println("No contact found with name "+ns);
			}
		}
		catch(Exception e) {
			System.out.println("No contacts found");
		}
	}

}
