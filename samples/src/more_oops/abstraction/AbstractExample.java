package more_oops.abstraction;
abstract class Dispenser{
	abstract String refillWith();
	abstract void despen();
	void refil() {
		System.out.println("Refilled with "+refillWith());
	}
}
class TissueDispenser extends Dispenser{

	@Override
	String refillWith() {
		
		return "tissue";
	}

	@Override
	void despen() {
		System.out.println("Despensing tissues...");
		
	}
	
	
}
class SanitizerDispenser extends Dispenser{

	@Override
	String refillWith() {
		
		return "Sanitizer";
	}

	@Override
	void despen() {
		System.out.println("Despensing sanitizer...");
		
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		Dispenser sanitizerDispenser = new SanitizerDispenser();
		sanitizerDispenser.refil();
		sanitizerDispenser.despen();
		Dispenser tissueDispenser = new TissueDispenser();
		tissueDispenser.refil();
		tissueDispenser.despen();
	}

}
