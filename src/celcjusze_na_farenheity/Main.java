package celcjusze_na_farenheity;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertBackwards(convert(123.43f)));
    }

    public static float convert(float temp){
        return temp * 9 / 5 + 32;
    }

    public static float convertBackwards(float temp){
        return (temp - 32) * 5 / 9;
    }
}
