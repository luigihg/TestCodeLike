package structures;

import java.util.Arrays;

// You're given an Array of integers
// increment each number in the array by 1
// parameter An array to integers
public class IncrementArray {

    public static int[] incrementArray(int[] numbers) {
      int[] newNumbers = new int[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
          newNumbers[i] = numbers[i] + 1;
      }
       return newNumbers;
    }

    public static void main(String[] args) {
     //   int[] numbers = {7,17,-13,19,5};
        int[] numbers2 = {1,2,3,4,5};

        int[] result = incrementArray(numbers2);
        System.out.println(Arrays.toString(result));

    }
}
