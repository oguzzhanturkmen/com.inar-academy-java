package chapters.chapter_06;

public class Exercise_32 {
    public static void main(String[] args) {
       int counter = 0;
        for(int i =0; i < 10000; i++){
        while(true) {
            int dice = rollDice();

            if (dice == 2 || dice == 3 || dice == 12) {
                break;
            }
            if (dice == 7 || dice == 11) {
                counter++;
                break;
            } else {
                int holdPoint = dice;

                while (true) {
                    dice = rollDice();

                    if (dice == 7) {
                        break;
                    } else if (dice == holdPoint) {
                        counter++;
                        break;
                    }


                }
            }
            break;
        }
        }
        System.out.println("Won " + counter + " times.");


    }
    public static int rollDice(){
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);


        return dice1 + dice2;
    }


}
