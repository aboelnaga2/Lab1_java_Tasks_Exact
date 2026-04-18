package lab3;

public class Task5_NumberMethods {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }



    public static int reverseNumber(int n) {
        int reversed = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp /= 10;
        }

        return (n < 0) ? -reversed : reversed;
    }



    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // Negative numbers are generally not palindromes
        return n == reverseNumber(n);
    }


    public static int sumDigits(int n) {
        n = Math.abs(n);

        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }


    public static void main(String[] args) {
        System.out.println("--- NumberUtils Task 5 Test Results ---");


        int p = 17;
        System.out.println("Is " + p + " prime? " + isPrime(p));
        System.out.println("Is 21 prime? " + isPrime(21));


        int r = 1234;
        System.out.println("Reverse of " + r + ": " + reverseNumber(r));


        int pal = 1221;
        System.out.println("Is " + pal + " a palindrome? " + isPalindrome(pal));
        System.out.println("Is 123 a palindrome? " + isPalindrome(123));


        int s = 543;
        System.out.println("Sum of digits for " + s + ": " + sumDigits(s));

        System.out.println("---------------------------------------");
    }
}
