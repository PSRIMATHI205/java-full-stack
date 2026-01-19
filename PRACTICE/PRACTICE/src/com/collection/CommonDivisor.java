package com.collection;
import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int div=1;
		while(div<=n && div<=m) {
			if(n%div==0 && m%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
		
		
	}

}
