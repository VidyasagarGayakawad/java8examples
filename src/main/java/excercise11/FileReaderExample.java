package excercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("C:\\Java8Examples\\java8examples\\src\\main\\resources\\data.txt"));
        //lines.limit(2).forEach(System.out::println);
        /*lines.flatMap(line -> Arrays.stream(line.split(" "))).filter(word -> word.contains("o"))
                .forEach(System.out::println);
*/

        //find longest word in the file

        /*lines.flatMap(line -> Arrays.stream(line.split(" "))).filter(word -> !word.contains("o")).max(Comparator.comparingInt(String::length))
                .ifPresent(value -> System.out.print(value));*/

        //find shortest word in the file
        lines.flatMap(line -> Arrays.stream(line.split(" "))).filter(word -> word.contains("b"))
                .min(Comparator.comparingInt(String::length))
                .ifPresent(value -> System.out.print(value));
    }
}
