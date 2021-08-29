/*
	Write a program to print the following pattern?
	
	*****
	 ****
	  ***
	   **
	    *


*/

import java.util.Scanner;

public class Pattern6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i=0;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}