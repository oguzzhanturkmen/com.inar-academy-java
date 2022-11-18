package weeks.exercise_002;

public class Student extends Person {

    private int status;
    public final static int FRESHMAN = 1;
    public final static int JUNIOR = 2;
    public final static int SOPHOMORE = 3;
    public final static int SENIOR = 4;

    public Student() {
        this.status = FRESHMAN;
    }

    public Student(String name, String adress, String phoneNumber, String emailAdress) {
        super(name, adress, phoneNumber, emailAdress);
        this.status = FRESHMAN;
    }

    public Student(String name, String adress, String phoneNumber, String emailAdress, int status) {
        super(name, adress, phoneNumber, emailAdress);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "FRESHMAN";
            case 2:
                return "JUNIOR";
            case 3:
                return "SOPHOMORE";
            case 4:
                return "SENIOR";
            default:
                return "UNIDENTIFIED STATSU";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                getStatus();
    }
}
