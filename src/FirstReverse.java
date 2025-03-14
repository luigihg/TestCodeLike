import java.util.*;
import java.io.*;

class FirstReverse {

    public static String FirstReverse(String str) {
        StringBuilder sb= new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter words: ");
        System.out.print(FirstReverse(s.nextLine()));
    }

}