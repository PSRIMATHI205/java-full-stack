package com.collection;//functional interface
interface Example{
	void show();
}
public class Main {

	public static void main(String[] args) {
		Example e=new Example() {
			public void show() {
				System.out.println("Hello world");
			}
		};
		e.show();
		

	}

}
