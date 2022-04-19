package inheritance;
// when there is no default constructor in super class then we have to explicitly call it in subclass constructor
class A
{
/*	public A()
	{
		System.out.println("in A");
	}*/
	public void show() {
		System.out.println("Show of A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}
class B extends A
{   
	public void show() {
		System.out.println("Show of B");
	}
	public B()
	{
		super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in B int");
	}
}

public class SuperDemo 
{
	public static void main(String[] args)
	{	
		 A a = new B();
		 System.out.println(a.getClass().getName());
		 a.show();
	}
}
