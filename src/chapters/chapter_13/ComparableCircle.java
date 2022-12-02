package chapters.chapter_13;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getArea() > o.getArea()){
            return 1;
        }
        else if (this.getArea() == o.getArea()){
            return 0;
        }
        else {
            return -1;
        }

    }
}
