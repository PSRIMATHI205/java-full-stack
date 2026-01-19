package com.collection;//return keyword
interface Example2{
	int show(int i,int j);
}

public class Main2 {

	public static void main(String[] args) {
		Example2 e=(i,j)->{
			return i+j;
		};
		int value =e.show(5,89);
		System.out.println(value);
		

	}

}
