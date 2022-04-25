package coding_problems;

import java.util.Scanner;
/*
  1: A number is called stepping number if all of its adjacent digits, as well as the
first and the last digits, differ by one.
For example, 8789 is a stepping number whereas 234 is not. A single digit number is considered as a stepping number.
Write a program to find all the stepping numbers in a given range.
Examples:
Input:  4000, 5000
Output: 4323, 4343, 4345, 4543, 4545, 4565

Input: 0, 21
Output: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21
*/

public class SteppingNumbers {
	public static boolean checkStep(int x) {
		if(x<=10) {
			return true;
		}
		else {
		int leftmost = x % 10;
		int next=0;
		while (x / 10 > 0) {
			int cur = x % 10;
			next = (x / 10) % 10;
			x = x / 10;
			if (Math.abs((cur - next)) != 1) {
				return false;
			}

		}
		if(Math.abs((leftmost - next)) == 1) {
			return true;
		}
		else {
			return false;
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int counter = 0;
		for (int i = a; i <= b; i++) {
			if (checkStep(i)) {
				counter++;
				System.out.println(i);
			}
		}
		if (counter == 0) {
			System.out.println("No stepping numbers");
		}
	}

}
