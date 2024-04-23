package najdłuższy_ciąg_znaków_ułożony_alfabetycznie;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestAlphabeticString("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."/*.replaceAll(" ", "")*/));
    }

    public static String longestAlphabeticString(String data){
        TreeMap<Integer, Indexes> strings = new TreeMap<>(Comparator.reverseOrder());
        int length = 0, startIndex = 0, endIndex = 1;
        for (int i = 1; i < data.length(); i++) {
            if(data.charAt(i - 1) <= data.charAt(i)){
                length++;
                endIndex++;
            }
            else{
                strings.put(length, new Indexes(startIndex, endIndex));
                startIndex = i;
                endIndex = i + 1;
                length = 0;
            }
        }
        strings.put(length, new Indexes(startIndex, endIndex)); //pozwala wyłapać stringa który jest na końcu

        int firstKey = strings.keySet().stream().findFirst().get();

        return data.substring(strings.get(firstKey).startIndex, strings.get(firstKey).endIndex);
    }

    public record Indexes(
            int startIndex,
            int endIndex
    ) {}
}
