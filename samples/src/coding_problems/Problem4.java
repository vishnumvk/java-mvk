package coding_problems;

import java.util.Scanner;

//4: Given an mixed array of Red, Blue and Green colour balloons, arrange all the same colour balloons together by maintaining the order of colours based on first occurrence in the input array.
//Input: arr[] = {R, G, B, G, B, G, R}
//Output:{R, R, G, G, G, B, B}
//
//Input: arr[] = {B, G, B, R, G, R, B, G, R, R, B}
//Output: {B, B, B, B, G, G, G, R, R, R, R}
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of ballons ");
		int n = sc.nextInt();
		char ballons[] = new char[n];
		char order[] = new char[3];

		int bo = 0;
		for (int i = 0; i < n; i++) {
			ballons[i] = sc.next().charAt(0);
			if (ballons[i] != order[0] && ballons[i] != order[1] && ballons[i] != order[2]) {
				
				order[bo] = ballons[i];
				bo++;
			}
		}
		sc.close();
		for (int i = 0; i < order.length; i++) {
			for (int j = 0; j < ballons.length; j++) {
				if (ballons[j] == order[i]) {
					System.out.printf("%c ", ballons[j]);
				}
			}
		}

	}

}
