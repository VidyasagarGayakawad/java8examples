package excercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPreview {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String s1 = words.stream()
                .filter(word -> word.contains("o"))
                .findFirst()
                .orElse(null);
        System.out.println(s1);

        String s2 = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse(null);
        System.out.println(s2);


        // AND method use of predicate
        Predicate<String> charOccurance = x -> x.contains("o");
        Predicate<String> lengthCheck = x -> x.length() > 5;

        System.out.print("Predicate's AND method use: ");
        words.stream().filter(charOccurance.and(lengthCheck)).forEach(System.out::print);

        System.out.print("\nMulti Predicate filters elements to leave: ");
        FunctionUtils.firstAllMatch(words.stream(),
                word -> word.contains("o"),
                word -> word.length() > 5).forEach(System.out::print);

        System.out.print("\nPredicate to check if any match: ");
        FunctionUtils.firstAnyMatch(words.stream(),
                word -> word.contains("o"),
                word -> word.length() > 5).forEach(System.out::print);
    }
}

class FunctionUtils {
    public static <T> List<T> firstAllMatch(Stream<T> stream, Predicate<T>... predicates) {
        Stream<T> streamTemp = stream;
        for (Predicate predicate : predicates) {
            streamTemp = streamTemp.filter(predicate);
        }
        return streamTemp.collect(Collectors.toList());
    }

    public static <T> List<T> firstAnyMatch(Stream<T> stream, Predicate<T>... predicates) {
        Predicate<T> allPrediates = predicates[0];
        for (Predicate predicate : predicates) { // we will have to find a better way to or all predicates
            allPrediates = allPrediates.or(predicate);
        }
        return stream.filter(allPrediates).collect(Collectors.toList());
    }
}