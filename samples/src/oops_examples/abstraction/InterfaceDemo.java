package oops_examples.abstraction;

interface Drawable {
	void draw();
	default void mark() {
		System.out.println(" -------------");
	}
}

//Implementation: by second user  
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

//Using interface: by third user  
class InterfaceDemo {
	public static void main(String args[]) {
		Drawable d = new Circle();
		d.draw();
		d.mark();
		d=new Rectangle();
		d.draw();
		d.mark();
	}
}