package chapters.chapter_11;

import java.util.ArrayList;

public class CourseV2 {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();


    public CourseV2(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        students.add(student);
    }

    public String[] getStudents() {

        String[] array = (String[]) students.toArray();
        return array;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public int findIndexOfStudent(String student) {
        return students.indexOf(student);
    }

    public void clear() {
        students.clear();
    }
}


