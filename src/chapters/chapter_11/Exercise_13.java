package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(3);
        list.add(4);
        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (!tempList.contains(list.get(i))) {
                tempList.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(tempList);
    }
}
