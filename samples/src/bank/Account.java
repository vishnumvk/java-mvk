package bank;

public class Account {
    private String name;
	private float balance = 100.00f;
	private int pin;
	private long phoneno ;
	public Account(String name,long phoneno,int pin) {
		super();
		this.pin = pin;
		this.phoneno=phoneno;
		this.name=name;
	}
    public boolean validatePin(int x) {
    	if(x==this.pin) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public float getBalance() {
		return balance;
	}
    public long getPhoneno() {
    	return this.phoneno;
    }
	public void deposit(int x) {
		if (x > 0) {
			this.balance = this.balance + x;
		}
	}

	public void swipe(float x) {
		x = Math.round(x * 10.0f) / 10.0f;
		if (x > 0) {
			float cashback = Math.round(x * 0.01f * 10.0f) / 10.0f;
			this.balance = Math.round((this.balance - x + cashback)*10.0f)/10.0f;
			System.out.println("Cash back :" + cashback);
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
			if ((x + charges) <= this.balance) {
				this.balance = Math.round( (this.balance - (charges + x))* 10.0f) / 10.0f;
				System.out.println("Charges :" + charges);
			} else {
				System.out.printf("Cannot proceed the transcation of(%d + charges %.2f) as your balance is:%.2f\n" ,x,charges, this.balance);
			}
		}
	}

}
