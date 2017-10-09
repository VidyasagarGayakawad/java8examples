package excercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchesExample {
    public static List<String> allMatches(List<String> input, Predicate<String> predicate) {
        List<String> result = new ArrayList<>(10);
        for (String inputString : input)
            if (predicate.test(inputString)) {
                result.add(inputString);
            }
        return result;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(10);
        input.add("hell00");
        input.add("good");
        input.add("good-boy");

        List<String> result = allMatches(input, x -> x.length() <= 4);
        result.stream().forEach(System.out::print);

        List<String> wordsWithB = allMatches(input, s -> s.contains("b"));
        wordsWithB.stream().forEach(System.out::print);
    }
}