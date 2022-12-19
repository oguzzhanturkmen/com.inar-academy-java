package chapters.chapter_09;

public class Rectangle {

    public double width;
    public double height;

    public Rectangle(){
        this(1 , 1);
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }


}
