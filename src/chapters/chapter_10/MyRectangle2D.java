package chapters.chapter_10;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    private double getMinX() {
        return getX() - (getWidth() / 2);
    }

    private double getMaxX() {
        return getX() + (getWidth() / 2);
    }

    private double getMinY() {
        return getY() - (getHeight() / 2);
    }

    private double getMaxY() {
        return getY() + (getHeight() / 2);
    }

    public boolean overlaps(MyRectangle2D r) {
        if ((r.getMinX() <= this.getMaxX() && r.getMaxX() > this.getMaxX()) ||
                (r.getMaxX() >= this.getMinX() && r.getMinX() < this.getMinX()) ||
                (r.getMinY() <= this.getMaxY() && r.getMaxY() > this.getMaxY()) ||
                (r.getMaxY() >= this.getMinY() && r.getMinY() < this.getMinY())) {
            return true;
        }
        return false;
    }

    public boolean contains(double x, double y) {
        return ((this.x + (width / 2) >= x && x >= this.x - (width / 2)) &&
                (this.y + (height / 2) >= y && y >= this.y - (height / 2)));
    }

    public boolean contains(MyRectangle2D r) {

        if (this.getMinX() <= r.getMinX() &&
                this.getMaxX() >= r.getMaxX() &&
                this.getMinY() <= r.getMinY() &&
                this.getMaxY() >= r.getMaxY()) {
            return true;
        }
        return false;

    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double lowX = Double.MAX_VALUE;
        double lowY = Double.MAX_VALUE;
        double highX = Double.MIN_VALUE;
        double highY = Double.MIN_VALUE;


        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < lowX) {
                lowX = points[i][0];
            }
            if (points[i][1] < lowY) {
                lowY = points[i][1];
            }
            if (points[i][0] > highX) {
                highX = points[i][0];
            }
            if (points[i][1] > highY) {
                highY = points[i][1];
            }
        }

        double width = highX - lowX;
        double height = highY - lowY;
        double x = highX - (width / 2);
        double y = highY - (height / 2);

        return new MyRectangle2D(x, y, width, height);
    }
}
