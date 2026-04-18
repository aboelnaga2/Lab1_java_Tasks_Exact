package lab3;

public class Task2_StringUtilities {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }



    public static String capitalise(String s) {
        if (isEmpty(s)) return s;

        String first = s.substring(0, 1).toUpperCase();
        String rest = s.substring(1).toLowerCase();
        return first + rest;
    }



    public static String repeat(String s, int times) {
        if (s == null || times <= 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }



    public static int countChar(String s, char c) {
        if (s == null) return 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // --- Main Method  ---
    public static void main(String[] args) {
        System.out.println("--- StringUtils Task 2 Test Results ---");


        System.out.println("Is '' empty? " + isEmpty(""));
        System.out.println("Is 'Java' empty? " + isEmpty("Java"));


        System.out.println("Capitalise 'pROGRAMMING': " + capitalise("pROGRAMMING"));

        System.out.println("Repeat 'Echo' 3 times: " + repeat("Echo", 3));


        String sentence = "alphabetical";
        char target = 'a';
        System.out.println("Count '" + target + "' in '" + sentence + "': " + countChar(sentence, target));

        System.out.println("---------------------------------------");
    }

}
