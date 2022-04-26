package coding_problems;

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
	public static int getNextMax(int[] a, int n) {

		int max = Integer.MAX_VALUE;

		for (int i = n + 1; i < a.length; i++) {
			if (a[i] > a[n] && a[i] < max) {      // finds the next maximum 
				max = a[i];
			}
		}		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String ca[] = str.split(",[ ]*");      //
		int arraysize = (ca.length);           // to create int array from comma seperated input
		int a[] = new int[arraysize];          //
											   //
		for (int i = 0; i < ca.length; i++) {  //
			a[i] = Integer.parseInt(ca[i]);    //
		}									   //
		
		
		for (int i = 0; i < a.length-1; i++) {
			int temp = getNextMax(a, i);
			if (temp == Integer.MAX_VALUE) {
				for (int n = i; n < a.length-1; n++) {   // if next max is not present then prints
					System.out.printf("%d, ", -1);       // -1 instead of remaining elements      
				}                                        //  This loop will be executed only once
				
				break;

			} else {				
				System.out.printf("%d, ", temp);
			}
		}		
		System.out.println(-1);
	}

}
