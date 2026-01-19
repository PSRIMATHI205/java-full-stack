package com.collection;

public class AddDigit {

	public static void main(String[] args) {
		int n=38;
		int sum=0;
		for(int i=n;i!=0;i++) {
		if(n>9) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		
	}
	}

}
