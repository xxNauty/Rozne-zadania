package suma_ciagu_A_do_B;

public class Main {
    public static void main(String[] args) {
        calculate(-10, 11);
    }

    public static void calculate(int a, int b){
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        int sumaFor = 0, sumaWhile = 0, sumaDoWhile = 0;
        for (int i = a; i <=b; i++){
            sumaFor += i;
        }

        int j = a;
        while (j <= b){
            sumaWhile += j;
            j++;
        }

        int k = a;
        do{
            sumaDoWhile += k;
            k++;
        }while (k <= b);

        System.out.println(sumaFor);
        System.out.println(sumaWhile);
        System.out.println(sumaDoWhile);
    }
}
