package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneraBoletoUnique {
    private  static final int MIN=1;
    private  static final int MAX=50;
    private  static final int NUMS=5;

    private  static List<Integer> generaBoleto(){
        List<Integer> numeros = new ArrayList<>();
        for(int i=0;i<NUMS;i++){
           int num =generaNumero();
           while(numeros.contains(num)){
               num =generaNumero();
           }
           numeros.add(num);
        }
       Collections.sort(numeros);
        return numeros;
      }

      private static int generaNumero(){
          return (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
      }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            List<Integer> nums = generaBoleto();
            System.out.println(nums);
        }
    }


}
