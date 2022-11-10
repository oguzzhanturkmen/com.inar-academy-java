package chapters.chapter_10;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        if(numberOfStudents >= student.length()){
            String[] tempArray = new String[students.length * 2];
            System.arraycopy(students , 0 , tempArray , 0 , student.length());
            students = tempArray;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        int index = findIndexOfStudent(student);
        if(index == -1){
            System.out.println("Wrong student name entered !!!");
            System.exit(-1);
        }
        for (int i = index; i < student.length(); i++) {
            students[i] = students[i - 1];
        }
        numberOfStudents--;
    }
    public int findIndexOfStudent(String student){
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(student)){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }
}
