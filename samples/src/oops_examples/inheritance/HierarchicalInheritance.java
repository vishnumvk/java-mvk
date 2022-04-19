package oops_examples.inheritance;


//Dog, Cow (IS-A) Animal
//Dog , Cow inherits eat method and legs from Animal
class Animal{
	int legs=4;
	public void makeSound() {
		System.out.println("ufff .... uff..");
	}
	public void eat() {
		System.out.println("Eating ...");
	}
}

class Dog extends Animal{
	// Dog inherits features of Animal
	String Name;
	public void makeSound() {
		System.out.println("Bow ..... bow..");
	}
}
class Cow extends Animal{
	// Cow inherits features of Animal
	String Name;
	public void makeSound() {
		System.out.println("Mooo ..... Mooo..");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cow c1 = new Cow();
		d1.makeSound();
		d1.eat();
		c1.makeSound();
		c1.eat();
	}

}
