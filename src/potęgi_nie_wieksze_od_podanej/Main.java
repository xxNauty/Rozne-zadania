package potęgi_nie_wieksze_od_podanej;

public class Main {
    public static void main(String[] args) {
        print(63);
    }

    public static void print(int limit){
        int i = 1;
        while (Math.pow(i, 2) <= limit){
            System.out.print(i + ": ");
            System.out.println(Math.pow(i, 2));
            i++;
        }
    }
}
