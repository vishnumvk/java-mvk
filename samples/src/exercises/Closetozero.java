package exercises;
import java.util.Scanner;
public class Closetozero {
	static int findvalueClosetozero(int a[],int n) {
   	 int min_pos = Integer.MAX_VALUE;//this is predefined
   	 int max_neg = Integer.MIN_VALUE;//most -ve 
   	 for(int i=0;i<n;i++) {
   		 if(a[i]==0) 
   			 return 0;  //  0 is the answer
   		 if(a[i]>0) { //+ve case 
   			 if(a[i]<min_pos) 
   				 min_pos = a[i];
   		 }
   		 if(a[i]<0) { //-ve case 
   			 if(a[i]>max_neg) 
   				 max_neg = a[i];
   		 }
   	 }
   	 // max_neg = -10 
   	 // min_pos =5 
   	 if(max_neg == Integer.MIN_VALUE) {
   		 return min_pos;
   	 }
   	 else if(min_pos == Integer.MAX_VALUE) {
   		 return max_neg;
   	 }
   	 else {
   		 if(Math.abs(max_neg)<min_pos) {
   			 return max_neg;
   		 }
   		 else {
   			 return min_pos;
   		 }
   	 }
		
    }
	public static void main(String[] args) {
		System.out.println("Enter array length: ");
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++) {
      	  System.out.printf("Enter %d th element :",i);
      	  a[i]=sc.nextInt();
        }
        sc.close();
        
       System.out.println( "value close to zero is "+findvalueClosetozero(a,n));

	}

}
