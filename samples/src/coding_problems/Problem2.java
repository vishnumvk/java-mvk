package coding_problems;

import java.util.Scanner;

/*
 2: Given an array of 0s and 1s. Write a program to find the largest sub-array (start
and end index) that has the equal number of 0s and 1s.

Examples:

Input: {1, 0, 1, 1, 1, 0, 0, 0}
Output: 0 to 7

Input: {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6

Input: {1, 1, 1}
Output: No sub-array found.
 */
public class Problem2 {
    public static boolean checkArray(int n[],int start,int end) {
    	int z=0,o=0;
    	for(int i=start;i<end;i++) {
    		if(n[i]==0) {
    			z++;
    		}
    		else if(n[i]==1){
    			o++;
    		}
    	}
    	if(o==z) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ca[]=str.toCharArray();
		int arraysize = ca.length/3;
		int a[]=new int[arraysize];
		for(int i=1,j=0;i<ca.length;i=i+3,j++) {
			a[j]=Integer.parseInt(String.valueOf(ca[i]));
		}
		boolean found = false;
		loop:
		for(int size = a.length; size>=2;size--) {
			for(int i=0;i<=(a.length-size);i++) {
				

				
				
				if(checkArray(a,i,i+size)) {
					found = true;
		        	System.out.printf("%d to %d\n",i,i+size-1);
		        	break loop;
		        }
			}
		}
		if(!found) {
			System.out.println("No sub-array found.");
		}
        
	}

}
