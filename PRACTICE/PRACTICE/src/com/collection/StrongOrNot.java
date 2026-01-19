package com.collection;
import java.util.Scanner;

public class StrongOrNot {
	
	static int findFact(int n) 
	{
		int a=1;
		for(int i=1;i<=n;i++) {
			a=a*i;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int dup=n;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=findFact(rem);
			n=n/10;
		}
		if(dup==sum) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		

	}

}
