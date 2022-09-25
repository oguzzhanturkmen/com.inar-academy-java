package weeks.week_07;

public class Deneme {
    public static void main(String[] args) {

        String s = new String("oguzhan");
        System.out.println(s);
        change(s);
        System.out.println(s);


    }
    public static void change(String a){
        a.replace('o' , 'z');
    }
}
