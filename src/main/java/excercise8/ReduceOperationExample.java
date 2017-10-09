package excercise8;

import java.util.Arrays;
import java.util.List;

public class ReduceOperationExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "good");

        System.out.print("result1 goes here:");
        words.stream().reduce(String::concat).ifPresent(System.out::print);

        System.out.print("result2 goes here:");
        words.stream().map(String::toUpperCase).reduce(String::concat).ifPresent(System.out::print);

        System.out.print("string concatation with commo separated string:");
        String result = words.stream().map(String::toUpperCase).reduce("afterConcatation:", String::concat);
        System.out.print("result goes here:" + result);

        String results = words.stream().reduce("", (x, y) -> x.toUpperCase() + y.toUpperCase() + ",", (x, y) -> x + y);
        System.out.print("\nanswer:\n" + results);

        int sum = words.stream().map(x -> x.length()).reduce(0, Integer::sum);
        System.out.print("Sum goes here: " + sum);

        long count = words.stream().filter(w -> w.contains("h")).count();
        System.out.print("count" + count);
    }
}
