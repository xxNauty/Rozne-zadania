package modyfikacje_tablicy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task(){
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));
        float avg = calculateAvg(array);
        System.out.println("Min: " + findMin(array) + ", max: " + findMax(array));
        System.out.println("Średnia: " + avg);
        System.out.println("Mniejszych od średniej: " + countSmallerThanAvg(array, avg));
        System.out.println("Większych od średniej: " + countGreaterThanAvg(array, avg));
        System.out.println("Liczby w odwrotnej kolejności: ");
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static int findMax(int[] array){
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static float calculateAvg(int[] array){
        float sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    private static int countGreaterThanAvg(int[] array, float avg){
        int count = 0;
        for (int j : array){
            if(j > avg){
                count++;
            }
        }
        return count;
    }

    private static int countSmallerThanAvg(int[] array, float avg){
        int count = 0;
        for (int j : array){
            if(j < avg){
                count++;
            }
        }
        return count;
    }

    private static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
