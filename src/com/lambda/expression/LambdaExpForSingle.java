package com.lambda.expression;

public class LambdaExpForSingle {
	
	public static void main(String[] args) {
		
		SingleParameterDemo  demo = (city)->{
			
			return  city;
		};
		
		
		System.out.println(demo.getSingleParameter("Mumbai"));
	}

}
