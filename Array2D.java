package com.bridgelabz.functionaljavaprograms;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
	        int[][] arr;
	        int m, n, r, c;
	        Scanner sc = new Scanner(System.in);
	        	System.out.println("Entre the Value of Rows for Array :");
	        m = sc.nextInt();
	        	System.out.println("Enter the Value of Columns for Array :");
	        n = sc.nextInt();
	        arr = new int[m][n];
	        	System.out.println("Enter the Values in "+m+" x "+n+" Array Matrix:");

	        for(r = 0; r < m; r++) {
	            for(c = 0; c < n; c++) {
	                arr[r][c] = sc.nextInt();
	            }
	        }
	        	System.out.println("The Values in "+m+" x "+n+" Array Matrix are :\n");
	        for(r = 0; r < m; r++) {
	            for(c = 0; c < n; c++) {
	                System.out.print("\t"+ arr[r][c]);
	            }
	            System.out.print("\n");
       }
    }
}