package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_09 {
    public static void main(String[] args) {
        Course course = new Course("Math");

        course.addStudent("Filiz");
        course.addStudent("Oguz");
        course.addStudent("Aylin");
        course.addStudent("Mete");
        course.addStudent("Merve");

        course.dropStudent("Mete");
        System.out.println(Arrays.toString(course.getStudents()));


    }
    }

