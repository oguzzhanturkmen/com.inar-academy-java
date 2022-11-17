package chapters.chapter_11;

import chapters.chapter_09.Account;
import chapters.chapter_10.Circle2D;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Account());
        arrayList.add(new Date());
        arrayList.add(new Circle());

        System.out.println(arrayList);
    }
}
