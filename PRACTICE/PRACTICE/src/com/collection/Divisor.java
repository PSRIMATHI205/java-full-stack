package com.collection;
import java.util.Scanner;
public class Divisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int div=1;
		while(div<=n) {
			if(n%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
		

	}

}
