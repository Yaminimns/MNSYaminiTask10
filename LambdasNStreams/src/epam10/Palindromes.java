package epam10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palindromes {

	public static void main(String[] args) {
		List <String> pal = Arrays.asList("madam","apple","aaa","eve","tot","break");
		System.out.println(getPalindromes(pal));
	}
	static List<String> getPalindromes(List<String>palin){
		return palin.stream().filter(s->s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
	}

}
