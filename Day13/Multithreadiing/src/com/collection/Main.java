package com.collection;
class Cake extends Thread{
	public void run() {
		System.out.println("Mixing"+Thread.currentThread().getId());
		System.out.println("Baking"+Thread.currentThread().getId());
		System.out.println("Decoration"+Thread.currentThread().getId());
	}
}
public class Main {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			Cake c=new Cake();
			c.start();
		}
	}

}
