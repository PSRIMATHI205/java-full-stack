package com.collection;
class CakeCounter{
	int cakecount=0;
	public synchronized void cakecount() {
		cakecount++;
	}
}
class Team implements Runnable{
	CakeCounter cc;
	Team(CakeCounter cc){
		this.cc=cc;
		
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			cc.cakecount();
		}
	}
}

public class Main3 {
  public static void main(String[] args) throws Exception{
	  CakeCounter cc =new CakeCounter();
	  Thread t1=new Thread(new Team(cc));
	  Thread t2=new Thread(new Team(cc));
	  t1.start();
	  t2.start();
	  t1.join();
	  t2.join();
	  System.out.println(cc.cakecount);
	  }
}
