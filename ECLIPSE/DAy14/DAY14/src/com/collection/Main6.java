package com.collection;//double numbers greater than 10

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main6 {
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(2,5,67,7,77,12);
		int result=nums.stream()
				.filter(n->n>10)
				.map(n->n*2)
				.reduce(0,(a,b)->a+b);
		System.out.println(result);
		
	}

}
