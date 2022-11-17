package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(54);
        list2.add(18);
        list2.add(10);
        list2.add(3);
        list2.add(12);
        list2.add(99);
        list2.add(112);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(union(list1,list2));



    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}
