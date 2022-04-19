package examples.interfacedemo;
interface MyInterface{
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface");
	   }
	    void print();
	}
public class InterfaceExample implements MyInterface {
	 public static void main(String args[]) {
	      InterfaceExample obj = new InterfaceExample();


	      obj.display();
	     // obj.num=30; cannot be changed since interface members are final
	      System.out.println(MyInterface.num);
	      obj.print();
	   }

	@Override
	public void print() {
		System.out.println("Overriden print");
		
	}
}
