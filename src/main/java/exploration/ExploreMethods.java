package exploration;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExploreMethods {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("sagar", "vikram-raje");
        words.stream().map(w -> w.charAt(0)).forEach(System.out::print);

        Map<String, Integer> map = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.print(map);

        // find max length word of this collection
        words.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::print);

    }
}