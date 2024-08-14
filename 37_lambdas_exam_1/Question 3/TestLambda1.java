import java.util.Arrays;
import java.util.List;

public class TestLambda1{
	interface StringTest{
		String operate(String str);
	}

	public static void main (String [] args){
		List<String> names = Arrays.asList("Python", "Java");

		StringTest concat = (str) -> str + "-C";
		StringTest strV = (str) -> new StringBuilder(str).reverse().toString();

		processStrings(name, strV);
	}

	public static void processStrings(List<String> strings, StringTest operation){
		strings.forEach(str -> System.out.println(operation.operate(str).toUpperCase()));
	}
}