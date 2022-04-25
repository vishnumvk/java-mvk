package more_oops.inheritance;

//calculator-->ModrenCalculator--->AdvanceCalculator
class AdvanceCalculator extends ModernCalculator {

	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	public AdvanceCalculator(String model) {
		super(model);

	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
          AdvanceCalculator advcal = new AdvanceCalculator("fx2156");
          System.out.println(advcal.add(1,2,3)); //inherited from calculator
          System.out.println(advcal.sine(8.9));  // inherited from Modern calculator
          System.out.println(advcal.power(2, 5)); // own method
	}

}
