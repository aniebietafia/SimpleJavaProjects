package test_results;

import java.util.Scanner;

public class TestResults {
    public String testResults() {
        System.out.println("What is your test score?");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        char grade;
//        boolean isScore;
//        switch (isScore) {
//            case score > 89:
//                grade = 'A';
//                break;
//            case score > 69:
//                grade = 'B';
//                break;
//            case score > 49:
//                grade = 'C';
//                break;
//            case score > 39:
//                grade = 'D';
//                break;
//            case score > 29:
//                grade = 'E';
//                break;
//            default:
//                String message = "Invalid score";
//        }

                if (score > 89) {
            grade = 'A';
        } else if (score > 79) {
            grade = 'B';
        } else if (score > 59) {
            grade = 'C';
        } else if (score > 49) {
            grade = 'D';
        } else if (score > 39) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return "Your grade: " + grade;
    }
}
