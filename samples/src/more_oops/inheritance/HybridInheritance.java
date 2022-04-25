package more_oops.inheritance;

interface Moveable {
	public void run();
}

interface Speakable {
	public void speak();
}

abstract class HumanAbility implements Moveable, Speakable {
	public void showAbilities() {
		System.out.println("I am a person, I can speak and run !!");
	}
}

//child class inheriting two base interfaces
class Person extends HumanAbility {
	@Override
	public void run() {
		System.out.println("I am running !!");
	}

	@Override
	public void speak() {
		System.out.println("Hello !!");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.showAbilities();
		p1.run();
		p1.speak();

	}
}
