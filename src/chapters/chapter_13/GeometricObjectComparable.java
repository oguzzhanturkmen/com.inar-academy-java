package chapters.chapter_13;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObjectComparable() {
        dateCreated = new java.util.Date();
    }

    public GeometricObjectComparable(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObjectComparable o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }
        else if (this.getArea() == o.getArea()){
            return 0;
        }
        else {
            return -1;
        }
    }
    public static GeometricObjectComparable max(GeometricObjectComparable o1 , GeometricObjectComparable o2){
        if(o1.compareTo(o2) == 1){
            return o1;
        }
        else if(o1.compareTo(o2) == 0){
            return o1;
        }
        else{
            return o2;
        }
    }
    public abstract double getArea();

}
