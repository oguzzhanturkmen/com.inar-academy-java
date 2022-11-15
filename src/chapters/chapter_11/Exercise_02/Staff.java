package chapters.chapter_11.Exercise_02;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String adress, String phoneNumber, String emailAdress, double officeSalary, String title) {
        super(name, adress, phoneNumber, emailAdress, officeSalary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
