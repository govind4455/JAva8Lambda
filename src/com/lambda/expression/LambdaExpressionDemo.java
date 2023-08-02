package com.lambda.expression;

public class LambdaExpressionDemo {
	
	public  static void main(String[] args) {
		// No PARAMETERE
		Demo demo= ()->{
			return " Well done";
		};
		
		System.out.println(demo.getDemo());
	}

}
