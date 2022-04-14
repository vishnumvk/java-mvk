package dynamicMethodDispatch;

class Aa
{
	public void show()
	{
	System.out.println("in A");
	}
}
class Bb extends Aa
{
	public void show()
	{
		System.out.println("in B");
	}
	public void config() 
	{
		System.out.println("config");
	}
}
class C extends Aa
{
	public void show()
	{
		System.out.println("in C");
	}
}
public class OverriddingDemo 
{
	// compile time and runtime
	public static void main(String[] args)
	{
		Aa obj1 = new Bb();  // runtime polymorphism
		obj1.show();
		
		Aa obj2 = new Aa();
		obj2.show();  // Dynamic Method Dispatch
	}
}