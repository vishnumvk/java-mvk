package examples.anonymous;

//Types of interface
//1. Normal
//2. Single abstract method - Functional Interface - Lambda Expression - Scala
//3. Marker interface


interface A
{
	void show();
}

public class LamdaDemo
{
	public static void main(String[] args)
	{
		A obj =() -> System.out.println("Im the best");
		
				obj.show();
	}
}