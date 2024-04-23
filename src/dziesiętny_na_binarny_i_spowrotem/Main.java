package dziesiętny_na_binarny_i_spowrotem;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        decToBin(129);
        binToDec(new int[]{1, 0, 0, 0});
    }

    public static void decToBin(int number){
        Integer[] binaryNumber = new Integer[32];
        Arrays.fill(binaryNumber, 0);
        int i = 0;
        while (number > 0){
            binaryNumber[i] = number % 2;
            number /=2;
            i++;
        }
        Collections.reverse(Arrays.asList(binaryNumber));

        System.out.println(Arrays.toString(binaryNumber));
    }

    public static void binToDec(int[] number){
        int decimalNumber = 0;
        int i = number.length - 1;
        for (int element : number){
            decimalNumber += (int) (element * Math.pow(2, i));
            i--;
        }
        System.out.println(decimalNumber);
    }
}
