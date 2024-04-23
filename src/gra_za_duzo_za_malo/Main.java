package gra_za_duzo_za_malo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        game(generateRandom());
    }

    public static void game(int random){
        boolean finished = false;
        Scanner input = new Scanner(System.in);
        while (!finished){
            int guess = input.nextInt();
            if(guess < random){
                System.out.println("Za mało");
            }
            else if(guess > random) {
                System.out.println("Za dużo");
            }
            else{
                System.out.println("Trafione");
                finished = true;
            }
        }
    }

    private static int generateRandom(){
        Random random = new Random();
        return random.nextInt(MIN_VALUE, MAX_VALUE);
    }
}
