package lab4;

import java.util.HashMap;
import java.util.Map;
public class Task4_StringAnalyser {


    public static void main(String[] args) {
        String text = "Level up your coding skills with radar";
        analyse(text);
    }

    public static void analyse(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("Empty string provided.");
            return;
        }

        System.out.println("Analyzing: \"" + s + "\"");
        System.out.println("------------------------------------");


        String[] words = s.trim().split("\\s+");
        System.out.println("Total Words: " + words.length);


        String noSpaces = s.replace(" ", "");
        System.out.println("Total Characters (no spaces): " + noSpaces.length());


        int vowels = 0, consonants = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);


        System.out.println("Most Frequent Char: " + findMostFrequentChar(noSpaces));


        System.out.print("Palindromes found: ");
        boolean foundPal = false;
        for (String word : words) {
            if (isPalindrome(word) && word.length() > 1) {
                System.out.print(word + " ");
                foundPal = true;
            }
        }
        if (!foundPal) System.out.print("None");
        System.out.println("\n------------------------------------");
    }

    private static char findMostFrequentChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        char maxChar = ' ';
        int maxVal = -1;

        for (char c : s.toLowerCase().toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
            if (counts.get(c) > maxVal) {
                maxVal = counts.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }

    private static boolean isPalindrome(String word) {
        String w = word.toLowerCase();
        int left = 0, right = w.length() - 1;
        while (left < right) {
            if (w.charAt(left++) != w.charAt(right--)) return false;
        }
        return true;
    }

}
