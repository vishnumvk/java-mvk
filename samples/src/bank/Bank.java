package bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	HashMap<Long, Account> Accounts = new HashMap<>();

	public void createAccount() {
		long phoneno;
		String name;
		int pin;
		boolean nameflag=false;
		try {
			System.out.println("Enter 10 digit phone number :");
			phoneno = sc.nextLong(); 
			if(Long.toString(phoneno).length()!=10) {
				throw new Exception("Please enter proper phone number of 10 digits!!");
			}
			sc.nextLine();
			if (this.Accounts.keySet().contains(phoneno)) {
				System.out.println("you already have an account");
				return;
			}
			System.out.println("Enter Name :");
			name = sc.nextLine();
			
			if(!name.matches("[a-zA-Z]+")) {
				nameflag=true;
				throw new Exception("name can only have alphabets!!");
			}
			System.out.println("set pin 4 digit pin:");
			pin = sc.nextInt();
			if(Integer.toString(pin).length()!=4) {
				throw new Exception("please enter 4 digit pin");
			}
		} catch (Exception e) {
			if(e.getMessage()!=null)
			System.out.println("please try again with proper inputs\n"+e.getMessage());
			else {
				System.out.println("please try again with proper inputs");
			}
			if(!nameflag) {
				sc.nextLine();
			}
			return;
		}

		this.Accounts.put(phoneno, new Account(name, phoneno, pin));
		System.out.println("Account created successfully with deposit of 100");
		sc.nextLine();
		System.out.println();
	}
}
