package chapters.chapter_07;

public class Exercise_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        generateRandomNumbers(array);
        selectionSort(array);
        int key = (int)(Math.random() * 100000);

        long startTime = System.currentTimeMillis();
        int linearIndex = linearSearch(array , key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Linear index is : " + linearIndex);
        System.out.println("Linear search execution time is : " + executionTime);

        startTime = System.currentTimeMillis();
        int binaryIndex = binarySearch(array , key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Binary index is : " + binaryIndex);
        System.out.println("Binary search execution time is : " + executionTime);
    }


    public static void generateRandomNumbers(int[] generatedNumbers) {
        for (int i = 0; i < generatedNumbers.length; i++) {
            generatedNumbers[i] = (int) (Math.random() * 100000);
        }
    }
    public static int linearSearch(int[] array , int key){

        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int med = (high + low) / 2;
            if(key > array[med]){
                low = med + 1;
            }
            else if (key == array[med]){
                return med;
            }
            else{
                high = med - 1;
            }
        }
        return -low - 1;
    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){

            int minimum = array[i];
            int minimumIndex = i;

            for(int j = i + 1; j < array.length; j++){
                if(minimum > array[j]){
                    minimum = array[j];
                    minimumIndex = j;
                }
            }
            if(minimumIndex != i){
                array[minimumIndex] = array[i];
                array[i] = minimum;
            }
        }
    }
}