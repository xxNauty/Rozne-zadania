package bmi_kalkulator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(88f, 1.79f));
    }

    public static BigDecimal calculate(float weight, float height){
        float bmi = (float) (weight / Math.pow(height, 2));
        return new BigDecimal(bmi).setScale(1, RoundingMode.HALF_UP);
    }
}
