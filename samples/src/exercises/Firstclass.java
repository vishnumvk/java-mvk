
package exercises;
import java.util.*;
public class Firstclass {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Secondclass sc = new Secondclass();
		int t=1;
		while(t==1) {
		System.out.println("Enter a Number");
        int x= S.nextInt();
        sc.CheckEven(x);
        System.out.println("To check another number enter 1 , to end enter 0");
        t=S.nextInt();
        if(t==0) {
        	S.close();
        	System.out.println("Programe ended");
        }
	}}
}	
class Secondclass{	
	
	    public void CheckEven(int x) {
		if(x%2==0) {
        	System.out.printf("%d is EVEN\n",x);
        }
        else {
        	
        	System.out.printf("%d is ODD\n",x);
        }
	}
}

