import java.util.Arrays;

public class OcurrencesText {
     //Soluciona cuantes veces aparece la palabra word
    static int getOcurrences(String sources, String word) {
        String cleanUpString = sources.replaceAll("\\.","");

        return (int)Arrays.stream(cleanUpString.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();

    }

    public static void main(String[] args) {

        String source = "He is an example. Right here";
        String word = "here";
        System.out.println(getOcurrences(source, word));

    }
}
