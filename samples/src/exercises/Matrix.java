package exercises;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];
		int sol;
		System.out.println("enter matrix 1 :");
		for(int i=0; i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				//System.out.printf("enter (%d,%d)th element :", i,j);
				mat1[i][j]= s.nextInt();
				
			}
		}
		System.out.println("enter matrix 2 :");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				//System.out.printf("enter (%d,%d)th element :", i,j);
				mat2[i][j]= s.nextInt();
				
			}
		}
	/*	System.out.println("The sum of two matrices is :");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.printf("%5d ", mat1[i][j]+mat2[i][j]);
				if(j==2) {
					System.out.println();
				}
				
			}
		}*/
		System.out.println("The product of two matrices is :");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				sol=0;
				for(int k=0;k<3;k++) {
					sol = sol + (mat1[i][k]*mat2[k][j]);}
				System.out.printf("%5d ", sol);
				if(j==2) {
					System.out.println();
				}
				
			}
		}
		

s.close();
	}

}
