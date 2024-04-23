package choinka;

public class Main {
    public static void main(String[] args) {
        printChuinka(5);
    }

    public static void printChuinka(int size){
        for (int i = 1; i <= size; i++){
            String textToPrint = "-".repeat(size - i) + "*".repeat(i + i - 1) + "-".repeat(size - i);
            System.out.println(textToPrint);
        }
    }
}
