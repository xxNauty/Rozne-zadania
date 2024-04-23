package ilość_wystąpień_cyfr_w_tablicy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task(){
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }

        Map<Integer, Integer> results = new HashMap<>();

        for (int element : array){
            results.put(element, results.getOrDefault(element, 0) + 1);
        }

//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(results);
    }
}
