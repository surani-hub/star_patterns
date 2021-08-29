/*

	Write a program to print following pattern?
	 	
	    *
	   **
	  ***
	 ****
	*****
	 ****
	  ***
	   **
	    *


*/

import java.util.Scanner;

public class Pattern7{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
		for(int i=1;i<=num;i++){
			for(int j=num-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}	
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=num-1;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}