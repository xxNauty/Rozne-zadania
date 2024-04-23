package nieparzyste_mniejsze_od_podanej;

public class Main {
    public static void main(String[] args) {
        print(15);
    }

    public static void print(int limit){
        for (int i = 1; i <= limit; i++) {
            if(i % 2 != 0){
                System.out.print(i);
            }
        }
    }
}
