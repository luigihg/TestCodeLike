import java.util.Arrays;

public class SmallesPositiveInteger {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int smallestPositive = 1;
        for(int i=0; i<A.length; i++){
            if(A[i] == smallestPositive){
                smallestPositive++;
            } else if( A[i] > smallestPositive){
                break;
            }
        }
        return smallestPositive;
    }
}
