package chapters.chapter_12;

public class Exercise_01 {
    public static void main(String[] args) {

        args[0] = args[0].trim();
        args[1] = args[1].trim();
        args[2] = args[2].trim();

        int result = 0;

        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Wrong input " + ex.getMessage());
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
