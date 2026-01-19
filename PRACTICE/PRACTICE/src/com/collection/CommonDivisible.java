package com.collection;
import java.util.Scanner;

public class CommonDivisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		int div=1;
		while(div<=n) {
			if(div%3==0 && div%5==0) {
				System.out.print(div+" ");
			}
			div++;
		}

	}

}
