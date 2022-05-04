package solid.dip;
/*
      The Dependency Inversion Principle states that high level modules should not 
      depend on low level modules, both should depend on abstractions.
 */
interface SwipeToPay{
	void swipeToPay();
}
class DebitCard implements SwipeToPay{

	@Override
	public void swipeToPay() {
		
		System.out.println("swiping Debit card to pay");
	}
	
}
class CreditCard implements SwipeToPay{
	
	@Override
	public void swipeToPay() {
		
		System.out.println("swiping Credit card to pay");
	}
}
class Payment{
	void swipe(SwipeToPay swipe) {
		swipe.swipeToPay();
	}
}
public class Dipdemo {

	public static void main(String[] args) {
		Payment pay = new Payment();
		SwipeToPay debitcard = new DebitCard();
		SwipeToPay creditcard = new CreditCard();
		pay.swipe(creditcard);
		pay.swipe(debitcard);
	}

}
