package chapters.chapter_10;

public class Exercise_10 {
    public static void main(String[] args) {

        Queue list = new Queue();

        for (int i = 0; i < 21; i++) {
            list.enqueue(i);
        }
        System.out.println(list.toString());
        for (int i = 0; i < 21; i++) {
            System.out.println(list.dequeue());
        }
    }
}
