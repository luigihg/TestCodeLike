import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

    // Your answer should be a new list in reverse order.
    static List<Integer> getReversed(List<Integer> source) {
        List<Integer> reversed = new ArrayList<Integer>(source);
        Collections.reverse(reversed);
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        List<Integer> result = ReverseOrder.getReversed(numbers);

        System.out.println(result); //output [5, 19, 13, 17, 7]
    }

}
