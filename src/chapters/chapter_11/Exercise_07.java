package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        java.util.Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
