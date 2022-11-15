package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.MyDate;

public class Employee extends Person {

    private double officeSalary;
    private MyDate dateHired;

    public Employee() {
        super();
        dateHired = new MyDate();
        officeSalary = 0;
    }

    public Employee(String name, String adress, String phoneNumber, String emailAdress) {
        super(name, adress, phoneNumber, emailAdress);
        dateHired = new MyDate();
        officeSalary = 0;
    }

    public Employee(String name, String adress, String phoneNumber, String emailAdress, double officeSalary) {
        super(name, adress, phoneNumber, emailAdress);
        this.officeSalary = officeSalary;
        this.dateHired = new MyDate();
    }

    public double getOfficeSalary() {
        return officeSalary;
    }

    public void setOfficeSalary(double officeSalary) {
        this.officeSalary = officeSalary;
    }

    public String getDateHired() {
        return dateHired.getDay() + "," + dateHired.getMonth() + "," + dateHired.getYear();
    }

    public void setDateHired() {
        this.dateHired = new MyDate();
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Employee{" +
                "officeSalary=" + officeSalary +
                "Date is : " + getDateHired() +
                '}';
    }
}
