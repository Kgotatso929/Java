class LambdaFunctionTest{
	@FunctionalInterface
	interface LambdaFunction{
		int apply(int j);
		boolean equals(java.lang.Object arg0);
	}

	public static void main(String [] args){
		LambdaFunction lambdaFunction = i -> i * i;
		System.out.println(lambdaFunction.apply(10));
	}
}