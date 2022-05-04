package coding_problems;

import java.util.Scanner;

/*
 7: Write a function int digitSum(int no) which returns the sum of the digits in the given number.
For example, digitSum(8753) is 23. Use this function in the below problem.
Two integers x >= 0 and y >= 3 are said to be TRAPS if they satisfy any one of the following
conditions
- x and y are equal (ex: 3, 3)
-- One number is a multiple of the other (ex: 3, 12)
--- if z and y are TRAPS where z is the sum of the digits of x (ex: 895, 4 → 22, 4 → 4, 4
and 895, 11 → 22, 11)
TRAPSSEQ is a sequence of TRAPS generated for the given N1, N2 and y by following the
below steps
1. Generate numbers from N1 to N2 (including N1 and N2) say G
2. For each number x in G, if x and y are TRAPS then include x in the sequence
3. Increment y value by 2 when the TRAP is found and decrement by 1 otherwise
4. If y value is less than 3, then reset it to 3
Write a program to generate TRAPSSEQ for the given N1, N2 and y.
Examples:
Input:
N1 = 2 N2 = 8y = 3
Output:
3 6 8
Input:
N1 = 15 N2 = 45 y = 50
Output:
16 17 19 20 28 37
Input:
N1 = 25 N2=20, y = 5
Output:
NONE
 
Actions
 */
public class Problem7 {
    public static int digitSum(int x) {
    	int sum=0;
    	while(x!=0) {
    		sum = sum +(x%10);
    		x=x/10;
    	}
    	return sum;
    }
    public static boolean checkTraps(int x,int y) {
    	if(x==y || x%y==0 || y%x==0) {
    		return true;
    	} 	
    	else {
    		int sum = digitSum(x);
    		if(x==sum) {
        		return false;
        	}
    		else {
    		return checkTraps(sum,y);
    		}
    	}
    }
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n1=sc.nextInt();
	      int n2=sc.nextInt();
	      int y = sc.nextInt();
	      sc.close();
	      int count =0;
	      if(n1>n2) {
	    	  int temp=n2;
	    	  n2=n1;
	    	  n1=temp;
	      }
	      for(int x=n1;x<=n2;x++) {
	    	  if(checkTraps(x,y)) {
	    		  System.out.printf("%d ",x);
	    		  y=y+2;
	    		  count++;
	    	  }
	    	  else {
	    		  y--;
	    	  }
	    	  if(y<3) {
	    		  y=3;
	    	  }
	      }
	      if(count==0) {
	    	  System.out.println("NONE");
	      }
	}

}
