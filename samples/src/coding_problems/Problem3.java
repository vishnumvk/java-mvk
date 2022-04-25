package coding_problems;

import java.util.Arrays;
import java.util.Scanner;

/*
 3: Write a program to traverse an array from left to right and replace each number 
 with the next greater number present within the remaining elements from its position. 
 For example, from (4, 9, 23, 7) the next greater number to 4 is 7. If no such number is found, 
 then replace the remaining array elements with -1.

Examples:

Input: 2, 5, 7
Output: 5, 7, -1

Input: 2, 4, 8, 90, 77, 54
Output: 4, 8, 54, -1, -1, -1

Input: 2, -1, 0, -1, 3
Output: 3, 0, 3, 3, -1 
 */
public class Problem3 {
    public static int getMax(int []a,int n) {
    	int max = a[n];
    	int b[]= Arrays.copyOfRange(a, n+1, a.length);
    	Arrays.sort(b);
    	for(int i=0;i<b.length;i++) {
    		if(b[i]>max) {
    			return b[i];
    		}
    	}
    	return max;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String ca[]=str.split(",[ ]*");
		int arraysize = (ca.length);
		int a[]=new int[arraysize];
		for(int i=0;i<ca.length;i++) {
			a[i]=Integer.parseInt(ca[i]);
		}
		// a = input array
		int sol [] = new int[arraysize];
		for(int i=0;i<sol.length;i++) {
			sol[i]=-1;
		}
				
		for(int i=0;i<a.length;i++) {
			int temp =getMax(a,i);
			if(temp==a[i]) {
				break;
				
			}
			else {
				sol[i]=temp;
			}
		}
		for(int i=0;i<sol.length-1;i++) {
			
			System.out.printf("%d, ",sol[i]);
		}
		System.out.println(sol[sol.length-1]);
	}

}
