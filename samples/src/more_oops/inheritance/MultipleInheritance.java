package more_oops.inheritance;

interface Upi {
	void sendMoney();

	void recieveMoney();
}

interface Messaging {
	void sendMsg();

	void recieveMsg();
}

class Airtel implements Upi, Messaging {

	public void sendMsg() {
		System.out.println(" Message Sent...");

	}

	public void recieveMsg() {
		System.out.println(" Message Sent...");
	}

	public void sendMoney() {
		System.out.println(" Money Sent...");

	}

	public void recieveMoney() {
		System.out.println(" Money Recieved...");

	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		a.recieveMsg();
		a.recieveMoney();
		a.sendMsg();
		a.sendMoney();
	}

}
