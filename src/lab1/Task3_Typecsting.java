package lab1;

public class Task3_Typecsting {
    public static void main(String[] args) {
        double price = 29.99;

        int newPrice = (int) price;

        System.out.println(price);
        System.out.println(newPrice);

        System.out.println(7 / 2);          // 3
        System.out.println((double)7 / 2);  // 3.5

        String num = "42";
        int n = Integer.parseInt(num);

        System.out.println(n);
    }
}
