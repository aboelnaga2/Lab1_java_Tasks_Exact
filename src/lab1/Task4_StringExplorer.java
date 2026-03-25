package lab1;

public class Task4_StringExplorer {
    public static void main(String[] args) {
        String name = "Abdelrahman Hamdy";

        System.out.println("Length: " + name.length());
        System.out.println("Upper: " + name.toUpperCase());
        System.out.println("Lower: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Last char: " + name.charAt(name.length() - 1));

        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed: " + reversed);

        System.out.println("Contains space? " + name.contains(" "));
    }
}
