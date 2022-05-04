package solid.ocp;

// class Payment{
//	 public void PaymentProcessing(int x, String mode) {
//		 if(mode=="cash") {
//			 
//		 }
//		 else if(mode == "debitcard") {
//			 
//		 }
//	 }
// }
// 

class Payment{
public void PaymentProcessing(PaymentType mode) {
	 mode.processPayment();
}
}
interface PaymentType{
	void processPayment();
}
class Debitcard implements PaymentType{

	@Override
	public void processPayment() {
		System.out.println("paying through debitcard");
		
	}
	
}
class Creditcard implements PaymentType{

	
	public void processPayment() {
		System.out.println("paying through creditcard");
		
	}
	
}
class Cash implements PaymentType{

	
	public void processPayment() {
		System.out.println("paying cash");
		
	}
	
}
public class Ocpdemo {

	public static void main(String[] args) {
		Payment pay = new Payment();
		pay.PaymentProcessing(new Cash());
		pay.PaymentProcessing(new Creditcard());
		pay.PaymentProcessing(new Debitcard());

	}

}
