package excercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "one", "two", "three", "four", "five");
        words.stream().filter(word -> word.length() > 4).filter(word -> word.contains("e")).map(String::toUpperCase)
                .forEach(System.out::print);

        Object processsedWords[] = words.stream().filter(word -> word.length() > 4).filter(word -> word.contains("e")).map(String::toUpperCase)
                .collect(Collectors.toList()).toArray();

        System.out.print("\nprints elements here...");
        for (Object processsedWord : processsedWords) {
            System.out.print(processsedWord);
        }
    }
}
