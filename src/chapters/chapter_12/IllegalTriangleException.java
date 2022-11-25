package chapters.chapter_12;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double side1 , double side2 , double side3) {
        System.out.println("Illegal triangle : "  + side1 + "," + side2 + "," + side3);
    }
}
