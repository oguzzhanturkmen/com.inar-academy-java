package chapters.chapter_12;

public class Exercise_05 {
    public static void main(String[] args) throws IllegalTriangleException {

        try {
            TriangleModified triangleModified = new TriangleModified(1 , 1 ,20);
        }
        catch (IllegalTriangleException ex){
            System.out.println("WRONG TRIANGLE");
        }

    }
}
