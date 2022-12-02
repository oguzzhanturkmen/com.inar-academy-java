package chapters.chapter_13;

public class Exercise_07 {
    public static void main(String[] args) {
        Square[] array = {new Square(2,2) , new Square(4,4) , new Square(3,3) , new Square(8,8)};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getArea());
            System.out.println(array[i].howToColor());
        }
    }
}
