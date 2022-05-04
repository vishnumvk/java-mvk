package solid.srp;

public class Transactions {
       public Transactions(Account acc) {
		super();
		this.acc = acc;
	}

	Account acc;
	
	public void deposit(int x) {
		if (x > 0) {
			acc.setBalance(acc.getBalance() + x);
		}
	}

	public void withdraw(int x) {
		if (x > 0) {
			float charges = 0.00f;
			if (x <= 100) {
				charges = Math.round(x * 0.02f * 10.0f) / 10.0f;
			} else {
				charges = Math.round(x * 0.04f * 10.0f) / 10.0f;
			}
			if ((x + charges) <= acc.getBalance()) {
				acc.setBalance ( Math.round( (acc.getBalance() - (charges + x))* 10.0f) / 10.0f);
				System.out.println("Charges :" + charges);
			} else {
				System.out.printf("Cannot proceed the transcation of(%d + charges %.2f) as your balance is:%.2f\n" ,x,charges, acc.getBalance());
			}
		}
	
    }
}