package lab2;

public class Task2_DayNameswitch {
    public static void main(String[] args) {

        int[] testDays = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Input\tResult");
        System.out.println("--------------");

        for (int day : testDays) {

            String result = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6, 7 -> "Weekend";
                default -> "Invalid";
            };

            System.out.println(day + "\t" + result);
        }
    }
}
