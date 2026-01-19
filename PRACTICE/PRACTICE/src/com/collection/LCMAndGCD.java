package com.collection;
import java.util.Scanner;

public class LCMAndGCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=a*b;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		System.out.print("The LCM is:"+n/a);
		System.out.print("The GCD is:"+a);
		
	}

}
