package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main7 {

	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(3,5,6,7,9,10,8);
		int result=nums.stream()
				.filter(n->n%3==0)
				.map(n->n*n*n)
				.reduce(0,(a,b)->a+b);
		System.out.println(result);

	}

}
