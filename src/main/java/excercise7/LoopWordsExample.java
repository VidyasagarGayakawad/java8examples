package excercise7;

import java.util.Arrays;
import java.util.List;

/*
Loop down the words and print each on a separate line, with two spaces in front of each word.
        Don’t use map.
*/
public class LoopWordsExample {
    public static void main(String[] args) {
        LoopWordsExample object = new LoopWordsExample();
        List<String> words = Arrays.asList("hello", "hi", "good", "bad");

        System.out.print("print words with two spaces:\n");
        words.forEach(object::printWord);

        /*Repeat the previous problem, but without the two spaces in front. This is trivial if you use the same
        approach as in #1, so the point is to use a method reference here, as opposed to an explicit lambda
        in problem 1.*/

        System.out.print("print words without spaces:\n");
        words.forEach(object::printWordWithoutSpaces);
/*
        In the previous exercise, we produced transformed lists like this:
        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        Produce the same lists as above, but this time use streams and the builtin “map” method.*/
    }

    private void printWord(String word) {
        System.out.println("  " + word);
    }

    private void printWordWithoutSpaces(String word) {
        System.out.println(word);
    }

}
