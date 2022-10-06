package chapters.chapter_06;

public class Exercise_38 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.printf("%-4c", getRandomUpperCaseLetter());
            if (i % 10 == 0 ) {
                System.out.println();
            }
        }
        System.out.println("\n\n ----------------------------\n\n");
            for (int i = 1; i < 101; i++) {
                System.out.printf("%-4c", getRandomDigitCharacter());
                if (i % 10 == 0 ) {
                    System.out.println();
                }
            }
        }

        public static char getRandomCharacter(char ch1, char ch2) {
            return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        }
        public static char getRandomLowerCaseLetter() {
            return getRandomCharacter('a', 'z');
        }
        public static char getRandomUpperCaseLetter() {
            return getRandomCharacter('A', 'Z');
        }
        public static char getRandomDigitCharacter() {
            return getRandomCharacter('0', '9');
        }
        public static char getRandomCharacter() {
            return getRandomCharacter('\u0000', '\uFFFF');
        }
    }

