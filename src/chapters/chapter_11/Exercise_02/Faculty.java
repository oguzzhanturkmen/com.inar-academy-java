package chapters.chapter_11.Exercise_02;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String adress, String phoneNumber, String emailAdress, double officeSalary, String officeHours, String rank) {
        super(name, adress, phoneNumber, emailAdress, officeSalary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String adress, String phoneNumber, String emailAdress) {
        super(name, adress, phoneNumber, emailAdress);
        this.officeHours = "Unknown";
        this.rank = "Unknown";
    }

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty() {
        this.rank = "Unknown";
        this.officeHours = "Unknown";
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
