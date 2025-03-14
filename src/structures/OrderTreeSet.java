package structures;

import java.util.Comparator;
import java.util.TreeSet;

//Ordered by length of the String
public class OrderTreeSet {

    public static TreeSet<String> orderLengthString(String word1, String word2, String word3) {
    TreeSet<String> words = new TreeSet<>(Comparator.comparing(String::length));
    words.add(word1);
    words.add(word2);
    words.add(word3);
    return words;
    }

    public static void main(String[] args) {

        String word1 ="yellow";
        String word2 ="red";
        String word3 ="blue";
        TreeSet<String> result = orderLengthString(word1, word2, word3);
        System.out.println(result);


    }
}
