package structures;


// you're given a LinkedList of Strings
// Add a new String to LinkedList at a given index


import java.util.Arrays;
import java.util.LinkedList;

public class updatedLinkedList {

    public static LinkedList<String> incrementLinkedList(LinkedList<String> words, String newWord, int newPosition) {
        LinkedList<String> addNewWords = new LinkedList<>();
        words.add(newPosition, newWord);
        addNewWords.addAll(words);
        return addNewWords;
    }


    public static void main(String[] args) {
        LinkedList<String> addNewWords = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Mars"));
        int position = 2;
        String earth="Earth";
        LinkedList<String> result = incrementLinkedList(addNewWords, earth, position);
        System.out.println(result);

    }
}
