package pit_kalkulator;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(100_000));
    }

    public static float calculate(float income){
        float tax = 0;
        if(income < 85_528f){
            tax = 0.18f * income - 556.02f;
        }
        else{
            tax = 14_839.02f + 0.32f * (income - 85_528f);
        }

        return tax;
    }
}
