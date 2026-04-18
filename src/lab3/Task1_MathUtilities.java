package lab3;

public class Task1_MathUtilities {

    public static int max(int a, int b) {
        return (a >= b) ? a : b;

    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int absolute(int n) {
        return (n < 0) ? -n : n;
    }

    public static double power(double base, int exp) {
        double result = 1.0;
        int absExp = (exp < 0) ? -exp : exp;

        for (int i = 0; i < absExp; i++) {
            result *= base;
        }

        return (exp < 0) ? 1.0 / result : result;
    }


    public static void main(String[] args) {

        System.out.println("Max of 50 and 30: " + max(50, 30));
        System.out.println("Min of 50 and 30: " + min(50, 30));


        int num = 42;
        System.out.println("Is " + num + " even? " + isEven(num));


        int negativeNum = -155;
        System.out.println("Absolute of " + negativeNum + " is: " + absolute(negativeNum));


        double b = 2.0;
        int e = 5;
        System.out.println(b + " to the power of " + e + " is: " + power(b, e));


        System.out.println("2.0 to the power of -3 is: " + power(2.0, -3));
    }





}
