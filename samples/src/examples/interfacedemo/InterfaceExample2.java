package examples.interfacedemo;
interface MyInterface1{
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface1");
	   }
	    void print();
	}
interface MyInterface2{
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface2");
	   }
	    void print();
	    void show();
	}
public class InterfaceExample2 implements MyInterface1,MyInterface2 {

	public static void main(String[] args) {
		InterfaceExample2 it = new InterfaceExample2();
          it.display();
          it.print();
          it.show();
	}

	@Override
	public void display() {
		
		MyInterface1.super.display();
	}

	@Override
	public void print() {
		System.out.println("Overriden print");
		
	}

	@Override
	public void show() {
		System.out.println("Overriden show");
		
		
	}

}
