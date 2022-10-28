package chapters.chapter_08;

public class Exercise_29 {
    public static void main(String[] args) {
        int[][] m1 = Exercise_28.createMatrix();
        int[][] m2 = Exercise_28.createMatrix();

        System.out.println("Arrays are " + (equals(m1 , m2) ? " identical " : "not identical "));

    }
    public static boolean equals(int[][] m1, int[][] m2){

        int number = 0;

        for(int row =  0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                boolean contains = false;
                number = m1[row][col];

                for(int i =0; i < m2.length; i++){
                    for(int j = 0; j < m2[i].length; j++){
                        if(number == m2[i][j]){
                            contains = true;
                        }
                    }
                }
                if(contains == false){
                    return false;
                }
            }


        }
        return true;
    }
}
