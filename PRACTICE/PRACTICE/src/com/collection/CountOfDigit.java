package com.collection;
import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		while(n!=0){ 
			
			count++;
			n=n/10;
		}
		System.out.print(count);
		

	}

}