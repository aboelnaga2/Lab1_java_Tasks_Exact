package lab4;

import java.util.Arrays;
public class Task2_ReverseArray {

    public static void main(String[] args) {

        int[] evenArr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original (Even): " + Arrays.toString(evenArr));
        reverseArray(evenArr);
        System.out.println("Reversed (Even): " + Arrays.toString(evenArr));

        System.out.println();


        int[] oddArr = {10, 20, 30, 40, 50};
        System.out.println("Original (Odd):  " + Arrays.toString(oddArr));
        reverseArray(oddArr);
        System.out.println("Reversed (Odd):  " + Arrays.toString(oddArr));
    }


    public static void reverseArray(int[] arr) {
        if (arr == null) return;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap logic
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            left++;
            right--;
        }
    }

}
