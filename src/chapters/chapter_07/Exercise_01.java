package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students :");
        int numberOfStudents = input.nextInt();

        int[] studentArray = getStudentScores(numberOfStudents , input);
        displayGrades(studentArray);
    }
    public static int[] getStudentScores (int numberOfStudents , Scanner input){
        int[] studentArray = new int[numberOfStudents];
        for (int i = 0; i < studentArray.length; i++){
            studentArray[i] = input.nextInt();
        }
        return studentArray;
    }
    public static int bestScore(int[] studentArray){
        int max = studentArray[0];
        int index = 0;

        for(int i = 1; i < studentArray.length; i++){
            if(studentArray[i] > max){
                max = studentArray[i];
            }
        }
        return max;
    }
    public static char getGrades(int score , int max){

            if(score >= max - 10){
                return 'A';
            } else if(score >= max - 20){
                return 'B';
            }else if(score >= max - 30) {
                return 'C';
            }else if(score >= max - 40) {
                return 'D';
            }
            return 'F';
        }

        public static void displayGrades(int[] studentArray){
            int bestScore = bestScore(studentArray);
            for(int i = 0; i < studentArray.length; i++){
                char grade = getGrades(studentArray[i] , bestScore);
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade );
        }


        }


}
