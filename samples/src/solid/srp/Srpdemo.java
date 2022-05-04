package solid.srp;
class Account {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
    
	
	
}

public class Srpdemo {

	public static void main(String[] args) {
		

	}

}
