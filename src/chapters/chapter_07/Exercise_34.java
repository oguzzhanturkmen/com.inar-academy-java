package chapters.chapter_07;

import java.util.Arrays;

public class Exercise_34 {
    public static void main(String[] args) {
        char[] array ={'a' , 'c' , 'b', 'd' , 'g' , 'z'};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void selectionSort(char[] list) {
        for(int i = 0; i < list.length; i++){

            char min = list[i];
            int index = i;

            for(int j = i; j < list.length; j++){
                if((int)min > (int)list[j]){
                    min = list[j];
                    index = j;
                }
            }
            if(index != i){
                list[index] = list[i];
                list[i] = min;
            }
        }
    }
}
