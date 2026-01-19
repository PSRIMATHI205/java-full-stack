package com.collection;//product of odd numbers

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main5 {

	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(2,5,6,7,8,4);
		Stream<Integer>s1=nums.stream();
		Stream<Integer>s2=s1.filter(n->n%2!=0);
		int result =s2.reduce(1,(a,b)->a*b);
		System.out.println(result);

	}

}
