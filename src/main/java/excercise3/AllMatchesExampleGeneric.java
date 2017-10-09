package excercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchesExampleGeneric {
    public static <T> List<T> allMatches(List<T> input, Predicate<T> predicate) {
        List<T> result = new ArrayList<>(10);
        for (T inputString : input)
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

        List<Integer> ints = allMatches(Arrays.asList(1, 2, 5, 4, 6), x -> x % 2 == 0);
        ints.stream().forEach(System.out::print);

    }
}