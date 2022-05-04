package solid.lisvok;
/*
 
  Liskov's substitution principle implies that subclasses should be created such that ,
  no trouble is caused to the system that is written based on super class ,when super class objects
  are substituted by any of its sub class objects.  
  
*/
//abstract class BankAccount{
//	int balance;
//	abstract void deposit(int depositAmount);
//	abstract void withdraw(int withdrawAmount);
//	
//}
//class SavingsAccount extends BankAccount{
//	void deposit(int depositAmount) {
//		
//	}
//	void withdraw(int withdrawAmount) {
//		
//	}	
//}
//class CurrentAccount extends BankAccount{
//	void deposit(int depositAmount) {
//		
//	}
//	void withdraw(int withdrawAmount) {
//		
//	}	
//}
//class FixedAccount extends BankAccount{
//
//	void deposit(int depositAmount) {
//		
//	}
//	void withdraw(int withdrawAmount) {
//		// fixed account cannot support this.
//	}
//	
//}
//class BankWithdrawService{
//	BankAccount account;
//	public BankWithdrawService(BankAccount account) {
//		this.account=account;
//	}
//	public void withdraw(int amount) {
//        account.withdraw(amount);
//    }
//    public static void main(String[] args) {
//    	new BankWithdrawService(new SavingsAccount()).withdraw(100);//works fine
//    	new BankWithdrawService(new CurrentAccount()).withdraw(100);//works fine
//    	//not supported though FixedAccount is sub class of BankAccount
//    	//violates liskov's substitution principal
//	   new BankWithdrawService(new FixedAccount()).withdraw(100); 
//
//	}
//}
abstract class BankAccount{
	int balance;
	abstract void deposit(int depositAmount);
	//abstract void withdraw(int withdrawAmount); moving it to interface
	
}
interface WithdrawableAccount{
	void withdraw(int withdrawAmount);
}
class SavingsAccount extends BankAccount implements WithdrawableAccount{
	void deposit(int depositAmount) {
		
	}
	public void withdraw(int withdrawAmount) {
		
	}	
}
class CurrentAccount extends BankAccount implements WithdrawableAccount{
	void deposit(int depositAmount) {
		
	}
	public void withdraw(int withdrawAmount) {
		
	}	
}
class FixedAccount extends BankAccount{

	void deposit(int depositAmount) {
		
	}
	
}	
class BankWithdrawService{
	WithdrawableAccount account;
	public BankWithdrawService(WithdrawableAccount account) {
		this.account=account;
	}
	public void withdraw(int amount) {
        account.withdraw(amount);
    }
}	

public class Lspdemo {

	public static void main(String[] args) {
		new BankWithdrawService(new SavingsAccount()).withdraw(100);//works fine
    	new BankWithdrawService(new CurrentAccount()).withdraw(100);//works fine
//	    new BankWithdrawService(new FixedAccount()).withdraw(100);//fixed account is not a subtype.

	}

}
