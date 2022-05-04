package solid.isp;
/*
 Interface segregation principle implies that a user should not be forced 
 to implement unwanted methods of an interface.
 interface Upipayment{
  void pay();
  void giveCashbackasCredit();
  void giveVoucher();
   }
   there are many clients that use upipayment interface lkike gpay,paytm but in this 
   scenario gpay likes wants to implement all the methods but paytm doesnot want to implement 
   cashbackas credit but it is forced to do so.Solution for this scenario is possible using ISP.  
   
 */
interface UpiPayment{
	void pay();
}
interface CreditCashback{
	void giveCashbackasCredit();
}
interface VocherCashback{
	void giveVocher();
}
class Gpay implements UpiPayment,VocherCashback,CreditCashback{
	
	@Override
	public void pay() {
		
	}
	
	@Override
	public void giveCashbackasCredit() {
		
		
	}

	@Override
	public void giveVocher() {
		
		
	}

	
}
class Paytm implements UpiPayment,VocherCashback{
	
	@Override
	public void pay() {
		
	}
	

	@Override
	public void giveVocher() {
		
		
	}

	
}
public class Ispdemo {

	public static void main(String[] args) {
		

	}

}
