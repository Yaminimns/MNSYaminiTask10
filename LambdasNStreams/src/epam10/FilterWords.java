package epam10;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> wordfil = Arrays.asList("hat","ant","august","cake","cookies","avg","act","aaaa");
		System.out.println(getWords(wordfil));
	}
	static List<String> getWords(List<String> words){
		return words.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	}

}