package oops_examples.polymorphism;

class Animal {

	public void walk() {
		System.out.println("Animal is walking..");
	}

}

class Dog extends Animal {

	public void walk() {
		System.out.println("Dog is walking..");
	}
}

class Cat extends Animal {

	public void walk() {
		System.out.println("Cat is walking..");
	}
}

class Cow extends Animal {
//	public boolean walk() {
//		System.out.println("Cow is walking..t");
//		return true;
//	}    throws Unresolved compilation problem 

	public void walk() {
		System.out.println("Cow is walking..");
	}

}

public class Overriding {
	public static void main(String args[]) {
		Animal b; // dynamic method dispatch
		b = new Dog();
		b.walk();
		b = new Cat();
		b.walk();
		b = new Cow();
		b.walk();
		Cow c = new Cow();
		c.walk();
	}
}