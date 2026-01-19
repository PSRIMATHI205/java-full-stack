package com.collection;//lambda expression
interface Example1{
	
	void show();
}

public class Main1 {

	public static void main(String[] args) {
		Example1 e=()->System.out.println("Hello world");
		e.show();

	}

}
