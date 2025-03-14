package challenge;

import java.util.Arrays;

public class GeneraBoletoDuplicate {
    private  static final int MIN=1;
    private  static final int MAX=50;
    private  static final int NUMS=5;

    private  static int[] generaBoleto(){
        int[] nums = new int[NUMS];
        for(int i=0;i<NUMS;i++){
            nums[i]=generaNumero();
        }
        Arrays.sort(nums);
        return nums;
      }

      private static int generaNumero(){
          return (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
      }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            int[] nums = generaBoleto();
            System.out.println(Arrays.toString(nums));
        }
    }


}
