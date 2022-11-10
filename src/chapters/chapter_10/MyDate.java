package chapters.chapter_10;

import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
