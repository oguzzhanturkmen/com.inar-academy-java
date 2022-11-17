package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(7);
        System.out.println(max(arrayList));
    }
    public static Integer max(ArrayList<Integer> arrayList){
        if(arrayList.size() == 0){
            return null;
        }

        Integer number = java.util.Collections.max(arrayList);
        return number;
    }
}
