package more_oops.polymorphism;

class Triangle {
	String type;
	int side1;
	int side2;
	int side3;

	public Triangle(int side1, int side2, int side3) {
		this.type = "Scalane";
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(int side1, int side2) {
		this.type = "Isoceles";
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side2;
	}

	public Triangle(int side1) {
		this.type = "Equilateral";
		this.side1 = side1;
		this.side2 = side1;
		this.side3 = side1;
	}

	public String toString() {
		return this.type + "\nSide 1 = " + this.side1 + "\nSide 2 = " + this.side2 + "\nSide 3 = " + this.side3;
	}

}

public class Overloading {

	public static void main(String[] args) {
		Triangle a = new Triangle(4, 2, 3);
		Triangle b = new Triangle(2, 3);
		Triangle c = new Triangle(5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
