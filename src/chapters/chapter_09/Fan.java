package chapters.chapter_09;



public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getSpeed() {
        String str = "";
        switch (this.speed) {
            case SLOW: str = "SLOW"; break;
            case MEDIUM: str = "MEDIUM"; break;
            case FAST: str = "FAST"; break;
        }
        return str;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (on) {
            return "Fan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius;
        }
        else{
            return "Fan color: " + color + ", radius: " + radius + "fan is off";
        }
    }
}
