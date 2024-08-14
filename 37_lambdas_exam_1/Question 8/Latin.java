interface SuffixFunction{
	void call();
}

class Latin{
	public static void main(String [] args){
		final String word = "hello";
		SuffixFunction suffixFunc = () -> System.out.println(word + "ay");
		//word = "e";
		suffixFunc.call();
	}
}