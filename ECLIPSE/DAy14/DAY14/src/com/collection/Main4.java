package com.collection;//stream API

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main4 {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(2,5,6,7,8,4);
		Consumer<Integer> con=new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.print(n+" ");
			}
		};
		arr.forEach(con);
	}

}
