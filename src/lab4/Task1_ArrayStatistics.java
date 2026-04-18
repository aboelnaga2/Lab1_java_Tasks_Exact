package lab4;

public class Task1_ArrayStatistics {

    public static void main(String[] args) {

        int[] scores = {72, 88, 95, 61, 84, 79, 92, 55, 68, 90};


        printSummaryReport(scores);
    }

    public static void printSummaryReport(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("--- Array Statistics Report ---");
        System.out.println("Scores: " + java.util.Arrays.toString(arr));
        System.out.println("-------------------------------");
        System.out.println("Minimum Score:    " + findMin(arr));
        System.out.println("Maximum Score:    " + findMax(arr));
        System.out.println("Average Score:    " + calculateAverage(arr));
        System.out.println("Scores Above 80:  " + countAbove(arr, 80));
        System.out.println("-------------------------------");
    }

    // Finds the smallest
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int score : arr) {
            if (score < min) min = score;
        }
        return min;
    }

    // Finds the largest
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int score : arr) {
            if (score > max) max = score;
        }
        return max;
    }

    // Calculates the mean average
    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int score : arr) {
            sum += score;
        }
        return sum / arr.length;
    }


    public static int countAbove(int[] arr, int threshold) {
        int count = 0;
        for (int score : arr) {
            if (score > threshold) {
                count++;
            }
        }
        return count;
    }
}
