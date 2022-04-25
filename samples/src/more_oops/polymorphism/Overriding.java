package more_oops.polymorphism;

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

class CalcWithMemory extends Calculator {

	private int previous_answer = 0;

	@Override
	public int add(int... n) {
		int sum = 0;
		for (int a : n) {
			sum = sum + a;
		}
		this.previous_answer = sum;
		return sum;
	}

	@Override
	public int sub(int... n) {
		int sum = 0;
		for (int a : n) {
			sum = sum - a;
		}
		this.previous_answer = sum;
		return sum;
	}

	@Override
	public int multiply(int... n) {
		int sum = 1;
		for (int a : n) {
			sum = sum * a;
		}
		this.previous_answer = sum;
		return sum;
	}

	@Override
	public int divide(int a, int b) {
		try {

			int c = a / b;
			this.previous_answer = c;
			return c;
		} catch (Exception e) {
			System.out.println("cannot divide with zero");
			return b;
		}
	}

	public int getPreviousAnswer() {
		return this.previous_answer;
	}

	public CalcWithMemory(String model) {
		super(model);

	}

}

public class Overriding {

	public static void main(String[] args) {
		CalcWithMemory cm = new CalcWithMemory("fx1124");
		cm.add(1, 5, 8, 9, 45);
		System.out.println(cm.getPreviousAnswer());
		cm.divide(cm.getPreviousAnswer(), 2);
		System.out.println(cm.getPreviousAnswer());

	}

}
