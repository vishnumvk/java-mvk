package more_oops.inheritance;

class Calculator {
	protected String model;

	public Calculator(String model) {
		this.model = model;
	}

	public int add(int... n) {
		int sum = 0;
		for (int a : n) {
			sum = sum + a;
		}
		return sum;
	}

	public int sub(int... n) {
		int sum = 0;
		for (int a : n) {
			sum = sum - a;
		}
		return sum;
	}

	public int multiply(int... n) {
		int sum = 1;
		for (int a : n) {
			sum = sum * a;
		}
		return sum;
	}

	public int divide(int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println("cannot divide with zero");
			return b;
		}
	}
}
//simple inheritance
class ModernCalculator extends Calculator {
	public double sine(double a) {
		return Math.sin(a);
	}

	public double cosine(double a) {
		return Math.cos(a);
	}

	public ModernCalculator(String model) {
		super(model);
	}

}

public class SimpleInheritance {

	public static void main(String[] args) {
             ModernCalculator mc = new ModernCalculator("fx112");
             System.out.println(mc.add(123,321));//inherited from calculator
             System.out.println(mc.cosine(1.5));
	}

}
