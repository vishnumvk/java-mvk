package more_oops.abstraction;

interface Upi {
	void sendMoney();

	void recieveMoney();
}

class Phonepe implements Upi {

	@Override
	public void sendMoney() {
		System.out.println(" Money sent via Phonepe");

	}

	@Override
	public void recieveMoney() {
		System.out.println(" Money recieved via Phonepe");

	}

}

class Paytm implements Upi {

	@Override
	public void sendMoney() {
		System.out.println(" Money sent via Paytm");

	}

	@Override
	public void recieveMoney() {
		System.out.println(" Money recieved via Paytm");

	}

}

class Gpay implements Upi {

	@Override
	public void sendMoney() {
		System.out.println(" Money sent via Gpay");

	}

	@Override
	public void recieveMoney() {
		System.out.println(" Money recieved via Gpay");

	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		Upi phonepe = new Phonepe();
		phonepe.sendMoney();
		phonepe.recieveMoney();
		Upi paytm = new Paytm();
		paytm.sendMoney();
		paytm.recieveMoney();
		Upi gpay = new Gpay();
		gpay.sendMoney();
		gpay.recieveMoney();
	}

}
