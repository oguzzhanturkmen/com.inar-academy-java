package chapters.chapter_11.Exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {

        Person person = new Person("Oguzhan", "İstanbul", "05445444444", "oguzhan@oguzhan.com");
        Student student = new Student("Mete", "Bursa", "05333333333", "mete@mete.com", Student.JUNIOR);
        Employee employee = new Employee("Ahmet", "Ankara", "05222222222", "ahmet@ahmet.com", 2500);
        Faculty faculty = new Faculty("İhsan", "İstanbul", "05465464646", "ihsan@ihsan.com", 4500, "12", "Senior");
        Staff staff = new Staff("Sefa", "Ankara", "05444444444", "sefa@sefa.com", 5200, "Professor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
