package com.collection;
import java.util.Scanner;

public class CountOfDivisor {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	int div=1;
	int count=0;
	while(div<=n) {
		if(n%div==0) {
			count++;
		}
		div++;
	}
	System.out.print(count);
		
	}

}
