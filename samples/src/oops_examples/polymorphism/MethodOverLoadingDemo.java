package oops_examples.polymorphism;

class Calculator{
	public int add(int i,int j) {
		//System.out.println("from add(int i,int j)");
		return i+j;
	}
/*	public double add(int i,int j) {
		//System.out.println("from add(int i,int j)");
		return i+j;
	}//recognizes as duplicate method though return type is not same
*/	
	//overloading can be done by changing no of params or by changing datatype
	public double add(double i,double j) {
	
	return i+j;
}
	public int add(int...i) {
		int sum=0;
		for(int k:i) {
			sum+=k;
		}
		return sum;
	}
}
public class MethodOverLoadingDemo {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("sum is "+c.add(1.555,2.3534433));

	}

}
