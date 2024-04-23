package WIELOWĄTKOWE_największa_i_najmniejsza_z_podanych;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        Thread maxThread = new Thread(new FindMax(a, b, c));
        Thread minThread = new Thread(new FindMin(a, b, c));

        maxThread.start();
        minThread.start();

    }
}
