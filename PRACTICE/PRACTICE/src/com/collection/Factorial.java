package com.collection;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
			a=a*i;
		}
		System.out.print(a);
		
	}

}
