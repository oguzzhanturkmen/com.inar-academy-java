package soruCozumu;

public class Exercise_07_07 {
    public static void main(String[] args) {

        int[] occurrences = new int[10];
        countOccurrences(occurrences);
        displayResult(occurrences);

    }
    public static void countOccurrences(int[] occurrences){

        for (int i = 0; i < 100; i++){
            occurrences[(int)(Math.random() * 10)]++;
        }
    }
    public static void displayResult(int[] occurrences){
        for (int i = 0; i < occurrences.length; i++){
            System.out.println(i + "'s : " + occurrences[i]);
        }
    }
}
