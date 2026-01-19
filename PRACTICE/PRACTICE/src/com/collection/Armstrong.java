package com.collection;
import java.util.Scanner;

public class Armstrong {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.print("Enter the number:");
    	  int n=sc.nextInt();
    	  int dup=n;
    	  int sum=0;
    	  while(n!=0) {
    		  int rem=n%10;
    		  sum=sum+(int)Math.pow(rem, 3);
    		  n=n/10;
    	  }
    	  if(dup==sum) {
    		  System.out.print("true");
    	  }
    	  else {
    		  System.out.print(false);
    	  }
      }
}
