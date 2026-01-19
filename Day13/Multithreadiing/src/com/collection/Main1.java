package com.collection;
class Chocolate implements Runnable{
	public void run() {
		System.out.println("Mixing"+Thread.currentThread().getId());
		System.out.println("Baking"+Thread.currentThread().getId());
		System.out.println("Decoration"+Thread.currentThread().getId());
	}
}
public class Main1 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			Chocolate c=new Chocolate();
			Thread t=new Thread(c);
			t.start();
		}
	}

}
