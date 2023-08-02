package com.lambda.expression;

public class LambdaExpForMultple {
	
	public static void main (String [] args) {
		
		MultpleParameterDemo demos= (a,b)->(a+b);
		
		 System.out.println(demos.add(50, 60));
		 
		 
		 
		 MultpleParameterDemo demos1= (a,b)->(a*b);
		 
		 System.out.println(demos1.add(100, 60));
		 
		 
		
	}

}
