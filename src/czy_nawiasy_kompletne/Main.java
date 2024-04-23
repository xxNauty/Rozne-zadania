package czy_nawiasy_kompletne;

import java.util.*;

public class Main {

//    public static final List<Character> closingBrackets = List.of(')', '}', ']', '>');
//
//
//    public static void main(String[] args) {
//        System.out.println(areComplete("()()()"));
//    }
//
//    //([)] -> nie
//    //([]) -> tak
//    public static boolean areComplete(String data){
//        for(int i = 0; i < data.length(); i++){
//            switch (data.charAt(i)){
//                case '(':
//                    findClosing(data.substring(i), ')');
//                    break;
//                case '{':
//                    findClosing(data.substring(i), '}');
//                    break;
//                case '[':
//                    findClosing(data.substring(i), ']');
//                    break;
//                case '<':
//                    findClosing(data.substring(i), '>');
//                    break;
//                default:
//            }
//        }
//        return false;
//    }
//
//    private static boolean findClosing(String data, char closingBracket) {
//        List<Character> availableBrackets = new ArrayList<>(closingBrackets);
//        availableBrackets.remove(closingBracket);
//        for (char character : data.toCharArray()) {
//            if (character == closingBracket){
//                return true;
//            }
//            if(availableBrackets.contains(character)){
//                return false;
//            }
//        }
//        return false;
//    }

    public static final Set<Character> closingBrackets = Set.of(')', '}', ']', '>');

    public static void main(String[] args) {
        System.out.println(areComplete("z()()()((){<<>><<>>})"));
    }

    public static boolean areComplete(String data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data.toCharArray()) {
            if (closingBrackets.contains(c)) {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char openingBracket, char closingBracket) {
        return switch (openingBracket) {
            case '(' -> closingBracket == ')';
            case '{' -> closingBracket == '}';
            case '[' -> closingBracket == ']';
            case '<' -> closingBracket == '>';
            default -> false;
        };
    }
}
