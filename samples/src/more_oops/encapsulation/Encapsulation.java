package more_oops.encapsulation;

//no access to get password 
//no access to change email
class Account {
	private String user_Name;
	private String password;
	private String email_id;

	public Account(String user_Name, String password, String email_id) {
		super();
		this.user_Name = user_Name;
		this.password = password;
		this.email_id = email_id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	// skipping getter for password
	public void setPassword(String password) {
		this.password = password;
	}

	// skipping setter for email
	public String getEmail_id() {
		return email_id;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Account a1 = new Account("vishnuMvk", "mvk@123", "vishnu@gmail.com");
		System.out.println(a1.getUser_Name());
		System.out.println(a1.getEmail_id());
		// cannot access password
		// System.out.println(a1.getPassword());

		// changing user name and password
		System.out.println("After changing user name and password :");
		a1.setUser_Name("mvkVishnu");
		a1.setPassword("132@mvk");
		System.out.println(a1.getUser_Name());
		System.out.println(a1.getEmail_id());
	}

}
