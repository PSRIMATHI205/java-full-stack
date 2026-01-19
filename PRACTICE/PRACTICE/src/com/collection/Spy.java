package com.collection;

import java.util.Scanner;

public class Spy {
	static boolean Spy(int n) {
		int sum=0;
		int sum1=1;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			sum1=sum1*rem;
			n=n/10;
		}
		return sum==sum1?true:false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		if(Spy(n)) {
			System.out.println("yes");
		}
		else {
			System.out.print("false");
		}

	}

}
