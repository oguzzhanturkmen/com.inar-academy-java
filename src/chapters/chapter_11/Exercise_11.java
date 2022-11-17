package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(3);
        list.add(4);
        System.out.println(list);

        sort(list);

        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list) {
        int temp = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int max = list.get(i);

            for (int j = i; j < list.size(); j++) {
                if (list.get(j) > max) {
                    max = list.get(j);
                    index = j;
                }
            }
            if (list.get(i) != max) {
                temp = list.get(i);
                list.set(i, max);
                list.set(index, temp);
            }

        }
    }
}