package examples.constructors;
// example involving constructors and constructor chaining
import java.util.*;
public class Calculate {
    // method
	public void cal(int a,char c,int b) {
    	   switch (c) {
    	   case '+':
    		   System.out.printf("%d", a+b);
    		   break;
    	   case '-':
    		   System.out.printf("%d", a-b);
    		   break;
    	   case '*':
    		   System.out.printf("%d", a*b);
    		   break;
    	   case '/':
    		   //Exception handling for zero division
    		   try {
    		   System.out.printf("%d", a/b);
    		   break;}
    		   catch(Exception e) {
        		   System.out.println("Zero division error");
        		   break;
    		   }
		   default :
			   System.out.println("pass only +,-,*,/ as second parameter");
    	   }
       }
	//Default constructor with message
	/*public Calculate() {
		
    	this("HELP"); // invokes parameterized constructor using constructor chaining
    	System.out.println(" default constructor invoked parameterized constructor");
    }*/
	//Constructor with string parameter
	/*public Calculate(String s) {
		System.out.println("From parametrised constructor");
		if(s.equalsIgnoreCase("HELP")) {
			System.out.printf("Available methods in Calculate :\n cal(int ,char ,int)\n +,-,*,/ can be passed as char\n");
		}
    }*/
	
	
	public static void main(String[] args) {
		Calculate Do = new Calculate();//prints info using default constructor and constructor chaining
		//Calculate Do1 = new Calculate("HELP");//prints info
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		char symbol;
		System.out.println("Enter a number:");
		n1=sc.nextInt();
		System.out.println("Enter + or - or * or /");
		symbol=sc.next().charAt(0);
		System.out.println("Enter another number:");
		n2=sc.nextInt();
        Do.cal(n1, symbol, n2);
        sc.close();
	}

}
