package exercises;
import java.util.*;
public class Word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 4 inputs");
        int a[]= new int[4]; 
        for(int i=0;i<4;i++) {		
        a[i]= scn.nextInt();}
        
       
        
        char ct;
        for(int i=0;i<4;i++) {
        	ct = (char) a[i];
        	System.out.printf("%d - %c\n",a[i],ct);
        }
       
	}

}
