package exploration;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class HugeTests {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("great", "tom", "query");
        Consumer<String> printStrings = str -> System.out.print(str);
        Consumer<String> printExclamationMark = str -> System.out.print("...!");
        Consumer<String> complete = printStrings.andThen(printExclamationMark);
        complete.accept("hello");
        //conclusion: with the help of andThen we can combine n numbers of consumers into a one consumer
        //consumer class has only above two methods.

        // Function has apply method. we can define function in below way and apply that function to a any Input.
        Function<String, String> makeStringUppercase = input -> input.toUpperCase();
        String upperCase = makeStringUppercase.apply("make me uppercase");
        System.out.print("Uppercase string : " + upperCase);

        // andThen method use of a function
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> incrementValue = x -> x + 1;

        Function<Integer, Integer> squareAndThenIncremnt = square.andThen(incrementValue);
        int ans = squareAndThenIncremnt.apply(5);
        System.out.print("\nsquareAndThenIncremnt: " + ans); // 5 -> 5*5 = 25 -> 25 + 1 = 26 is the ans

        //compose method of a Function example
        Function<Integer, Integer> composeFunction = incrementValue.compose(square);
        ans = composeFunction.apply(5);
        System.out.print("\ncompose: " + ans);

        //identity function example
        Function<String, Integer> stringLength = input -> input.length();
        System.out.print(Function.identity());

        //searching a good example of identity
        System.out.print("\n use of identity function:");
        List<String> strings = Arrays.asList("hello", "hi");
        strings.stream().map(Function.identity()).collect(Collectors.toList())
                .forEach(System.out::print);

        System.out.print("\n without use of identity function:");
        strings.stream().collect(Collectors.toList())
                .forEach(System.out::print);
        // so identity method actually does an implicit conversion. not a big deal.

        BiFunction<String, String, String> stringConcatation = (string1, string2) -> string1.concat(string2);
        String result = stringConcatation.apply("hel", "lo");
        System.out.print("\n BiFunction Result: " + result);


        System.out.print("\n BiConsumer Result: ");
        BiConsumer<String, String> concatAndPrint = (x, y) -> System.out.print(x + y);
        concatAndPrint.accept("yes", "no");

        BooleanSupplier suplier = () -> true;
        System.out.print("\nboolean suplier example:"+suplier.getAsBoolean());
    }
}