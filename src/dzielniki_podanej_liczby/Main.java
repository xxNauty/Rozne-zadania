package dzielniki_podanej_liczby;

public class Main {
    public static void main(String[] args) {
        findDividers(64);
    }

    public static void findDividers(int number){
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
