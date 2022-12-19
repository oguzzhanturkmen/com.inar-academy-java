package chapters.chapter_13;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

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


    @Override
    public int compareTo(Rectangle o) {
        if(getArea() > o.getArea()){
            return 1;
        }
        else if (getArea() == o.getArea()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.compareTo((Rectangle)obj) == 0;
    }
}
