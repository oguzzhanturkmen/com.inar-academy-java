package chapters.chapter_10;

public class Exercise_26 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong input: operand 1 , operand 2 , operand 3 !!!");
            System.exit(-1);
        }
        args[0] = args[0].trim();
        args[1] = args[1].trim();
        args[2] = args[2].trim();

        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
