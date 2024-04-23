package ile_dużych_w_stringu;

public class Main {
    public static void main(String[] args) {
        System.out.println(countLowercase("qwerDFSqewA"));
        System.out.println(countUppercase("qwerDFSqewA"));
        System.out.println("qwerDFSqewA".length());
    }

    public static int countUppercase(String text){
        int count = 0;
        for(char character : text.toCharArray()){
            if (character == Character.toUpperCase(character)){
                count++;
            }
        }
        return count;
    }

    public static int countLowercase(String text){
        int count = 0;
        for(char character : text.toCharArray()){
            if (character == Character.toLowerCase(character)){
                count++;
            }
        }
        return count;
    }
}
