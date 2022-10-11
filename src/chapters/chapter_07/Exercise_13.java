package chapters.chapter_07;

public class Exercise_13 {
    public static void main(String[] args) {

        for(int i = 0; i < 20; i++){
            System.out.println(getRandom(1 , 3 , 5 ,10 , 14 , 20 , 21 , 40 , 50, 30));
        }

    }
    public static int getRandom(int... numbers){
        boolean checkForExclusion = true;
        int randomNumber = 0;

        while(checkForExclusion){

            randomNumber = (int)((Math.random() * 54 )+ 1);

            for(int i = 0; i < numbers.length; i++){
                if(randomNumber == numbers[i]){
                    break;
                }
                checkForExclusion = false;
            }
        }
        return randomNumber;
    }
}
