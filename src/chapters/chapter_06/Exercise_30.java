package chapters.chapter_06;

public class Exercise_30 {
    public static void main(String[] args) {

        while(true){
            int dice = rollDice();

            if(dice == 2 || dice == 3 || dice == 12){
                System.out.println("You lose !");
                break;
            }
            if(dice == 7 || dice == 11){
                System.out.println("You win !");
                break;
            }
            else{
                int holdPoint = dice;
                System.out.println("Point is " + holdPoint);

                while(true){
                    dice = rollDice();

                    if(dice == 7){
                        System.out.println("You lose !");
                        break;
                    }
                    else if(dice == holdPoint){
                        System.out.println("You win !");
                        break;
                    }


                }
            }
            break;
        }


    }
    public static int rollDice(){
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        System.out.print("You rolled " + dice1 + "+" + dice2 + "=" + (dice1+dice2) + "\n");

        return dice1 + dice2;
    }



}
