package chapters.chapter_07;

public class Exercise_23 {
    public static void main(String[] args) {

        //NOT WORKING PROPERLY AT THE MOMENT

        boolean [] lockers = new boolean[101];
        changeLockers(lockers);
        displayLockers(lockers);

        }
        public static void changeLockers(boolean[] lockers){
            for(int i = 1; i < lockers.length; i++){

                if(i == 1){
                    for (int j = 1; j < lockers.length; j++){
                        lockers[j] = true;
                    }
                }
                else if( i == 2) {
                    for (int j = 2; j < lockers.length; j++) {
                        lockers[j] = false;
                    }
                }
                else{
                    for(int j = i; j < lockers.length; j += i){
                        if(lockers[j] ){
                            lockers[j] = false;
                        }
                        else{
                            lockers[j] = true;
                        }
                    }

                }
            }
    }
    public static void displayLockers(boolean[] lockers){
        int lockerCounter = 0;
        for (int i = 1; i < lockers.length; i++){

            if(lockers[i]){
                System.out.printf("%-3d" , i );
                lockerCounter++;
                if(lockerCounter % 10 == 0){
                    System.out.println();
                }

            }
        }
    }
}
