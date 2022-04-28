package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank xyz = new Bank();
		xyz.Accounts.put(8309914972l, new Account("vishnu",8309914972l,1234));
		Atm atm = new Atm();

		while (true) {
			int option = 0;
			System.out.println("select an option :\n1.create account\n2.ATM services");
			try {

				option = sc.nextInt();
				// sc.nextLine();
			} catch (Exception e) {
				System.out.println("please select from suggested options");
				sc.nextLine();

			}
			switch (option) {
			case 1:
				xyz.createAccount();
				break;
			case 2:
				atm.services(xyz);
                break;
			
				
			}
		}
	}
}
