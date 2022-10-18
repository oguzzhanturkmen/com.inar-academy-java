package soruCozumu.week_01;

import java.util.Scanner;

public class Cozum_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the students : ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        getScores(scores, input);
        getGrades(scores , grades);
        displayGrades(scores, grades);

    }

    public static void getScores(int[] scores, Scanner input) {
        System.out.println("Enter scores : ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
    }

    public static int findMax(int[] scores) {
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static void getGrades(int[] scores, char[] grades) {
        int max = findMax(scores);

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= max - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= max - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= max - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= max - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
    public static void displayGrades(int[] scores , char[] grades){
        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grades[i]);
        }
    }
}
