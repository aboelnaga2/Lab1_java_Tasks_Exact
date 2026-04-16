package lab2;

public class Task3_TimesTable {

    public static void main(String[] args) {
        int size = 5;


        System.out.print("      ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---------------------------");


        for (int row = 1; row <= size; row++) {

            System.out.printf("%2d | ", row);


            for (int col = 1; col <= size; col++) {

                System.out.printf("%4d", (row * col));
            }


            System.out.println();
        }
    }
}
