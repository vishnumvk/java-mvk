package bank;

import java.util.Scanner;

public class Atm {
	Scanner sc = new Scanner(System.in);

	public void services(Bank xyz) {
		boolean exit = false;
		long card;
		System.out.println("enter card number (same as your phonenumber) :");
		try {

			card = sc.nextLong();
			do {
				int pin;
				if (xyz.Accounts.keySet().contains(card) && card != 0) {
					Account a = xyz.Accounts.get(card);

					System.out.printf(
							"--------------------------\nSelect any option :\n1.Show balance\n2.withdraw\n3.swipe\n4.deposit\n5.exit\n--------------------------");
					int option = 0;
					try {

						option = sc.nextInt();

					} catch (Exception e) {
						System.out.println("please select form the suggested options !");
						sc.nextLine();

					}
					switch (option) {
					case 1:
						System.out.println("enter your 4 digit pin");
						pin = sc.nextInt();
						if (a.validatePin(pin)) {
							System.out.println("Balance " + a.getBalance());
						} else {
							System.out.println("incorect pin");
						}
						break;
					case 2:
						System.out.println("enter your 4 digit pin");
						pin = sc.nextInt();

						if (a.validatePin(pin)) {
							System.out.println("enter amount in multiples of 5:");
							int withdraw = sc.nextInt();
							if (withdraw % 5 == 0) {
								a.withdraw(withdraw);
								System.out.println("Balance " + a.getBalance());
							} else {
								System.out
										.println("Please correct the amount of value. It should be multiple of USD 5");
							}
						} else {
							System.out.println("incorect pin");
						}

						break;
					case 3:
						System.out.println("enter your 4 digit pin");
						pin = sc.nextInt();
						if (a.validatePin(pin)) {
							System.out.println("enter amount");
							float swipe = sc.nextFloat();
							if (swipe <= a.getBalance()) {
								a.swipe(swipe);
								System.out.println("Balance " + a.getBalance());
							} else {
								System.out.println("low balance");
							}
						} else {
							System.out.println("incorect pin");
						}
						break;
					case 4:
						System.out.println("enter your 4 digit pin");
						pin = sc.nextInt();
						if (a.validatePin(pin)) {
							System.out.println("enter amount in whole figures");
							int deposit = sc.nextInt();
							a.deposit(deposit);
							System.out.println("Balance " + a.getBalance());
						} else {
							System.out.println("incorect pin");
						}
						break;
					case 5:
						exit = true;
						break;
					default:

					}
				} else {
					System.out.println("Card not found");
					exit = true;

				}
			} while (!exit);

		} catch (Exception e) {
			System.out.println("please provide correct details !");
			sc.nextLine();

		}

	}
}
