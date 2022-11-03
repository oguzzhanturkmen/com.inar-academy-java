package chapters.chapter_09;

public class Exercise_01 {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width :  " + rect1.width + " height :  " + rect1.height + "" + " perimeter : " + rect1.getPerimeter() + " area : " + rect1.getArea());
        System.out.println("Rectangle 2 widht :  " + rect2.width + " height :  " + rect2.height + "" + " perimeter :  " + rect2.getPerimeter() + " area : " + rect2.getArea());
    }
    }

