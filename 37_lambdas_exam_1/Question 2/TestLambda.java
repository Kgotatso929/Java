import java.util.Arrays;
import java.util.List;

public class TestLambda{
	//Functional interface
	interface StringTest{
		String operate(String str);
	}

	public static void main(String [] args){
		List<String> names = Arrays.asList("Python", "Java", "Ruby");

		StringTest concat = (str) -> str + "-C";
		processStrings(names, concat);
	}

	public static void processStrings(List<String> strings, StringTest operation){
		for(String str : strings){
			String result = operation.operate(str);
			System.out.println(result.toUpperCase());
		}
	}
}
