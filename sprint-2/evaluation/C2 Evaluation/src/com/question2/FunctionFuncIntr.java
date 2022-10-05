package com.question2;

import java.util.function.Function;

public class FunctionFuncIntr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f = s -> Integer.parseInt(s);
		
		System.out.println(  f.apply("300") + 500 );

	}

}
