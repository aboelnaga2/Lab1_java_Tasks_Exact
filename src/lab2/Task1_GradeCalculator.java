package lab2;

public class Task1_GradeCalculator {

    public static void main(String[] args) {

        int[] testScores = {98, 85, 72, 63, 40};

        System.out.println("Score\tGrade\tMessage");
        System.out.println("-------------------------------");

        for (int score : testScores) {
            String grade;
            String message;


            if (score >= 90) {
                grade = "A";
                message = "Excellent!";
            } else if (score >= 80) {
                grade = "B";
                message = "Good job!";
            } else if (score >= 70) {
                grade = "C";
                message = "Satisfactory.";
            } else if (score >= 60) {
                grade = "D";
                message = "Needs improvement.";
            } else {
                grade = "F";
                message = "Failed. Please seek help.";
            }

            System.out.println(score + "\t" + grade + "\t" + message);
        }
    }
}
