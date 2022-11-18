package weeks.exercise_002;

public class Exercise_02 {
    public static void main(String[] args) {

        Person person = new Person("Oguz", "İstanbul", "0544544544", "oguz@oguz.com");
        Student student = new Student("Ertugrul", "İstanbul", "0533533533", "ertugrul@ertugrul.com", Student.SENIOR);
        Staff staff = new Staff("Mesut", "İstanbul", "05656565", "mesut@mesut.copm", 5000, "Supervisor");
        Faculty faculty = new Faculty("Ali" , "Bursa" , "053434344" , "ali@ali.com" , 100000 , "10000" , "Super" );
        Employee employee = new Employee("Ahmet", "İzmir", "9384743", "ahmet@ahmet", 2500 );

        System.out.println(person.toString());
        System.out.println(student);
        System.out.println(staff);
        System.out.println(faculty);
        System.out.println(employee);
    }
}


