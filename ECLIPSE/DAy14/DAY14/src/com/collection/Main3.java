package com.collection;//parameterized lambda expression
interface Example3{
	void show(int i,int j);
}

public class Main3 {

	public static void main(String[] args) {
		Example3 e=(i,j)->System.out.println(i+j);
		e.show(2, 7);

	}

}
