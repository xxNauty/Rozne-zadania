package suma_podawanych_przez_usera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        int sum = 0;
        while (!finished){
            int number = input.nextInt();
            if(number == 0){
                finished = true;
            }
            else {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
