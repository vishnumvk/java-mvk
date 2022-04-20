package oops_examples.inheritance;

class Animal_ {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog_ extends Animal_ {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog_ {
	void weep() {
		System.out.println("weeping...");
	}
}

class MultilevelInheritance {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}
