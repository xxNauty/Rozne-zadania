package najmniejsza_z_3_podanych;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        smallestFromThree();
    }

    public static void smallestFromThree(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 3 liczby: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a < b){
            if(a < c){
                System.out.println("A: " + a);
            }
            else{
                System.out.println("C: " + c);
            }
        }
        else{
            if(a < c){
                System.out.println("B: " + b);
            }
            else{
                System.out.println("C: " + c);
            }
        }
    }
}
