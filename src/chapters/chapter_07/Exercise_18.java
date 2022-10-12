package chapters.chapter_07;

import java.util.Arrays;

public class Exercise_18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 9;
        for (int i = 0  ; i < array.length; i++ ){
            array[i] = j;
            j--;
        }
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void bubbleSort(int[] array){

        for(int i = 1; i < array.length ; i++){
            for (int j = 0; j < array.length - i; j++){
                if(array[j + 1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
