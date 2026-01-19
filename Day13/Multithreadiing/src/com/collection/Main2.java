package com.collection;
class Bakery extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("updateing db");
		
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		}
	}
}
class Cake2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(i);
		}
	}
}

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Cake2 c=new Cake2();
		Bakery ch=new Bakery();
		ch.start();
		c.start();
		c.setPriority(10);
		ch.join();
		c.join();
		System.out.println("End of program");
		
	}

}