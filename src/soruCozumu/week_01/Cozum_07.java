package soruCozumu.week_01;

public class Cozum_07 {
    public static void main(String[] args) {

        int[] occurrences = new int[10];
        int[] generatedNumbers = new int[100];
        generateRandomNumbers(generatedNumbers);
        displayGeneratedNumbers(generatedNumbers);
        countOccurrences(occurrences, generatedNumbers);
        displayResult(occurrences);


    }
    public static void generateRandomNumbers(int[] generatedNumbers){
        for(int i = 0; i < generatedNumbers.length; i++){
            generatedNumbers[i] = (int)(Math.random() * 10);
        }
    }
    public static void displayGeneratedNumbers(int[] generatedNumbers){
        System.out.println("Generated numbers are : ");

        for(int i = 0; i < generatedNumbers.length; i++){
            System.out.print(generatedNumbers[i] + (((i + 1) % 10 == 0) ? "\n" : " "));
        }
    }
    public static void countOccurrences(int[] occurrences , int[] generatedNumbers){
        for(int i = 0; i < generatedNumbers.length; i++){
            occurrences[generatedNumbers[i]]++;
        }
    }
    public static void displayResult(int[] occurrences){
        for(int i = 0; i < occurrences.length; i++){
            System.out.println(i + "'s " + occurrences[i]);
        }
    }
}
